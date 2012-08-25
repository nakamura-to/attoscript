package atto.lang;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;

import atto.AttoTree;

public class Runtime {

    protected Env currentEnv;

    protected final Interpreter interpreter;

    protected final PrintWriter out;

    protected Obj objProto;
    protected Obj boolProto;
    protected Obj funProto;
    protected Obj integerProto;
    protected Obj arrayProto;
    protected Obj stringProto;
    protected Obj nullObj;
    protected Obj trueObj;
    protected Obj falseObj;

    public Runtime(Interpreter interpreter, PrintWriter out) {
        this.interpreter = interpreter;
        this.out = out;
    }

    public void init() {
        currentEnv = new Env(this);

        objProto = new Obj(this, null);
        funProto = new Obj(this, objProto);
        arrayProto = new Obj(this, objProto);
        boolProto = new Obj(this, objProto);
        integerProto = new Obj(this, objProto);
        stringProto = new Obj(this, objProto);

        nullObj = new Null(this, objProto);
        trueObj = new Obj(this, boolProto, true);
        falseObj = new Obj(this, boolProto, false);

        initObjProto();
        initFunProto();
        initArrayProto();
        initBoolProto();
        initIntegerProto();
        initStringProto();

        initNullObj();

        // builtin function
        currentEnv.put("print", new BuiltinFun.PrintFun(this, out));
    }

    protected void initObjProto() {
        objProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                HashSet<String> set = new HashSet<String>();
                StringBuilder buf = new StringBuilder();
                buf.append("{");
                for (Obj p = receiver; p != null; p = p.__proto__) {
                    for (Map.Entry<String, Obj> e : p.values.entrySet()) {
                        String key = e.getKey();
                        if (!set.contains(key)) {
                            set.add(key);
                            buf.append(key);
                            buf.append(": ");
                            Obj value = e.getValue();
                            Obj string = value.send("toString");
                            if (stringProto.isPrototypeOf(value)) {
                                buf.append("\"");
                                buf.append(string.object);
                                buf.append("\"");
                            } else {
                                buf.append(string.object);
                            }
                            buf.append(", ");
                        }
                    }
                }
                if (set.size() > 0) {
                    buf.delete(buf.length() - 2, buf.length());
                }
                buf.append("}");
                return newString(buf.toString());
            }
        });
    }

    public void initArrayProto() {
        arrayProto.put("length", newInteger(0));

        arrayProto.addMethod("push", new Method("element") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int length = receiver.getInt("length");
                receiver.put(String.valueOf(length), args[0]);
                receiver.put("length", newInteger(length + 1));
                return receiver;
            }
        });

        arrayProto.addMethod("set", new Method("index", "element") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int index = args[0].getInt();
                Obj element = args[1];
                int length = receiver.getInt("length");
                for (; length < index; length++) {
                    receiver.send("push", newNull());
                }
                receiver.put(String.valueOf(index), element);
                receiver.put("length", newInteger(length + 1));
                return receiver;
            }
        });

        arrayProto.addMethod("get", new Method("index") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int index = args[0].getInt();
                Obj element = receiver.get(String.valueOf(index));
                return element == null ? nullObj : element;
            }
        });

        arrayProto.addMethod("map", new Method("fun") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) args[0];
                int length = receiver.getInt("length");
                Obj result = newArray();
                for (int i = 0; i < length; i++) {
                    String key = String.valueOf(i);
                    Obj element = receiver.values.get(key);
                    Obj newElement = fun.call(receiver, new Obj[] { element,
                            newInteger(i) });
                    result.values.put(key, newElement);
                }
                result.put("length", newInteger(length));
                return result;
            }
        });

        arrayProto.addMethod("filter", new Method("fun") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) args[0];
                int length = receiver.getInt("length");
                Obj result = newArray();
                int index = 0;
                for (int i = 0; i < length; i++) {
                    Obj element = receiver.values.get(String.valueOf(i));
                    Obj bool = fun.call(receiver, new Obj[] { element,
                            newInteger(i) });
                    if (isTrue(bool)) {
                        result.values.put(String.valueOf(index), element);
                        index++;
                    }
                }
                result.put("length", newInteger(index));
                return result;
            }
        });

        arrayProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int length = receiver.getInt("length");
                StringBuilder buf = new StringBuilder();
                buf.append("[");
                for (int i = 0; i < length; i++) {
                    Obj element = receiver.values.get(String.valueOf(i));
                    Obj string = element.send("toString");
                    buf.append(string.object);
                    buf.append(", ");
                }
                if (length > 0) {
                    buf.delete(buf.length() - 2, buf.length());
                }
                buf.append("]");
                return newString(buf.toString());
            }
        });
    }

    public void initFunProto() {
        funProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) receiver;
                StringBuilder buf = new StringBuilder();
                buf.append("(");
                String[] params = fun.params;
                int len = fun.params.length;
                for (int i = 0; i < len; i++) {
                    buf.append(params[i]);
                    buf.append(", ");
                }
                if (len > 0) {
                    buf.delete(buf.length() - 2, buf.length());
                }
                buf.append(")->...");
                return newString(buf.toString());
            }
        });

    }

    protected void initBoolProto() {
        boolProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return newString(receiver.object.toString());
            }
        });

    }

    protected void initIntegerProto() {
        integerProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return newString(receiver.object.toString());
            }
        });
    }

    protected void initStringProto() {
        stringProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return receiver;
            }
        });

    }

    protected void initNullObj() {
        nullObj.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return newString("null");
            }
        });
    }

    public Obj obj() {
        return objProto;
    }

    public Obj bool() {
        return boolProto;
    }

    public Obj fun() {
        return funProto;
    }

    public Obj array() {
        return arrayProto;
    }

    public Obj integer() {
        return integerProto;
    }

    public Obj string() {
        return stringProto;
    }

    public Obj _null() {
        return nullObj;
    }

    public Obj _true() {
        return trueObj;
    }

    public Obj _false() {
        return falseObj;
    }

    public Obj newObj() {
        return new Obj(this, objProto);
    }

    public Obj newSimpleFun(String[] params, AttoTree body) {
        return new SimpleFun(this, currentEnv, params, body);
    }

    public Obj newCompositeFun(Fun first, Fun second) {
        return new CompositeFun(this, currentEnv, first, second);
    }

    public Obj newArray() {
        return new Obj(this, arrayProto);
    }

    public Obj newString(String s) {
        return new Obj(this, stringProto, s);
    }

    public Obj newInteger(Integer i) {
        return new Obj(this, integerProto, i);
    }

    public Obj newBool(Boolean bool) {
        if (bool) {
            return trueObj;
        }
        return falseObj;
    }

    public Obj newNull() {
        return nullObj;
    }

    public boolean isTrue(Obj obj) {
        return trueObj.isPrototypeOf(obj);
    }

    public Obj exec(AttoTree tree) {
        return (Obj) interpreter.exec(tree);
    }

}
