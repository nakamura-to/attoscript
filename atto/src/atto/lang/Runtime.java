package atto.lang;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Map;

import atto.AttoTree;

public class Runtime {

    protected Env currentEnv;

    protected final Interpreter interpreter;

    protected final PrintWriter out;

    protected Obj objProto;
    protected Obj boolProto;
    protected Obj funProto;
    protected Obj numberProto;
    protected Obj arrayProto;
    protected Obj stringProto;
    protected Obj propProto;

    protected Obj nullObj;
    protected Obj trueObj;
    protected Obj falseObj;

    protected ClassFun objClass;
    protected ClassFun boolClass;
    protected ClassFun funClass;
    protected ClassFun arrayClass;
    protected ClassFun numberClass;
    protected ClassFun stringClass;

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
        numberProto = new Obj(this, objProto);
        stringProto = new Obj(this, objProto);
        propProto = new Obj(this, objProto); // TODO

        objClass = new ClassFun(this, currentEnv, new String[] {}, "Object",
                objProto);
        funClass = new ClassFun(this, currentEnv, new String[] {}, "Function",
                funProto);
        arrayClass = new ClassFun(this, currentEnv, new String[] {}, "Array",
                arrayProto);
        boolClass = new ClassFun(this, currentEnv,
                new String[] { "__value__" }, "Boolean", boolProto);
        numberClass = new ClassFun(this, currentEnv,
                new String[] { "__value__" }, "Number", numberProto);
        stringClass = new ClassFun(this, currentEnv, new String[] {}, "String",
                stringProto);

        initObjProto();
        initFunProto();
        initArrayProto();
        initBoolProto();
        initNumberProto();
        initStringProto();
        initPropProto();

        nullObj = new Obj(this, objProto);
        nullObj.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return newString("null");
            }
        });
        trueObj = new Obj(this, boolProto);
        trueObj.put("__value__", new Value(true));
        falseObj = new Obj(this, boolProto);
        falseObj.put("__value__", new Value(false));

        // built-in constructors
        currentEnv.put(objClass.name, objClass);
        currentEnv.put(funClass.name, funClass);
        currentEnv.put(arrayClass.name, arrayClass);
        currentEnv.put(boolClass.name, boolClass);
        currentEnv.put(numberClass.name, numberClass);
        currentEnv.put(stringClass.name, stringClass);

        // built-in function
        currentEnv.put("print", new BuiltinFun.PrintFun(this, out));
        currentEnv.put("assert", new BuiltinFun.AssertFun(this, out));
    }

    protected void initObjProto() {
        objProto.addMethod("==", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (receiver == rhs) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        objProto.addMethod("!=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                if (receiver.send("==", args).asBoolean()) {
                    return falseObj;
                }
                return trueObj;
            }
        });

        objProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                StringBuilder buf = new StringBuilder();
                buf.append("{");
                for (Map.Entry<String, Obj> e : receiver.values.entrySet()) {
                    String key = e.getKey();
                    buf.append(key);
                    buf.append(": ");
                    Obj value = e.getValue();
                    Obj string = value.send("toString");
                    if (stringProto.isPrototypeOf(value)) {
                        buf.append("\"");
                        buf.append(string.get("__value__"));
                        buf.append("\"");
                    } else {
                        buf.append(string.get("__value__"));
                    }
                    buf.append(", ");
                }
                if (buf.length() > 3) {
                    buf.delete(buf.length() - 2, buf.length());
                }
                buf.append("}");
                return newString(buf.toString());
            }
        });
    }

    public void initArrayProto() {
        arrayProto.put("__proto__", arrayProto);
        arrayProto.put("length", newNumber(0));

        arrayProto.addMethod("==", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj other = args[0];
                if (!arrayProto.isPrototypeOf(other)) {
                    return falseObj;
                }
                int length = receiver.getBigDecimal("length").intValue();
                if (length != other.getBigDecimal("length").intValue()) {
                    return falseObj;
                }
                for (int i = 0; i < length; i++) {
                    String key = String.valueOf(i);
                    Obj element = receiver.values.get(key);
                    Obj otherElement = other.values.get(key);
                    Obj result = element.send("==", otherElement);
                    if (!result.asBoolean()) {
                        return falseObj;
                    }
                }
                return trueObj;
            }
        });

        arrayProto.addMethod("push", new Method("element") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int length = receiver.getBigDecimal("length").intValue();
                receiver.put(String.valueOf(length), args[0]);
                receiver.put("length", newNumber(length + 1));
                return receiver;
            }
        });

        arrayProto.addMethod("set", new Method("index", "element") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int index = args[0].asBigDecimal().intValue();
                Obj element = args[1];
                int length = receiver.getBigDecimal("length").intValue();
                for (; length < index; length++) {
                    receiver.send("push", nullObj);
                }
                receiver.put(String.valueOf(index), element);
                receiver.put("length", newNumber(length + 1));
                return receiver;
            }
        });

        arrayProto.addMethod("get", new Method("index") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int index = args[0].asBigDecimal().intValue();
                Obj element = receiver.get(String.valueOf(index));
                return element == null ? nullObj : element;
            }
        });

        arrayProto.addMethod("map", new Method("fun") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) args[0];
                int length = receiver.getBigDecimal("length").intValue();
                Obj result = newArray();
                for (int i = 0; i < length; i++) {
                    Obj key = newNumber(i);
                    Obj element = receiver.send("get", new Obj[] { key });
                    Obj newElement = fun.call(receiver, new Obj[] { element,
                            newNumber(i) });
                    result.send("push", new Obj[] { newElement });
                }
                result.put("length", newNumber(length));
                return result;
            }
        });

        arrayProto.addMethod("filter", new Method("fun") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) args[0];
                int length = receiver.getBigDecimal("length").intValue();
                Obj result = newArray();
                int index = 0;
                for (int i = 0; i < length; i++) {
                    Obj key = newNumber(i);
                    Obj element = receiver.send("get", new Obj[] { key });
                    Obj bool = fun.call(receiver, new Obj[] { element,
                            newNumber(i) });
                    if (bool == trueObj) {
                        result.send("push", new Obj[] { element });
                        index++;
                    }
                }
                result.put("length", newNumber(index));
                return result;
            }
        });

        arrayProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int length = receiver.getBigDecimal("length").intValue();
                StringBuilder buf = new StringBuilder();
                buf.append("[");
                for (int i = 0; i < length; i++) {
                    Obj key = newNumber(i);
                    Obj element = receiver.send("get", new Obj[] { key });
                    Obj string = element.send("toString");
                    buf.append(string.get("__value__"));
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
        funProto.addMethod("|>", new Method("arg") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) receiver;
                return fun.call(nullObj, args);
            }
        });

        funProto.addMethod(">>", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun lhs = (Fun) receiver;
                Obj rhs = args[0];
                if (!(rhs instanceof Fun)) {
                    throw new RuntimeException("not function: ");
                }
                return newCompositeFun(lhs, (Fun) rhs);
            }
        });

        funProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                // TODO
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
        boolProto.addMethod("!", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                if (receiver == trueObj) {
                    return falseObj;
                } else {
                    return trueObj;
                }
            }
        });

        boolProto.addMethod("&&", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                if (receiver == trueObj && args[0] == trueObj) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        boolProto.addMethod("||", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                if (receiver == trueObj || args[0] == trueObj) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        boolProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return newString(receiver.get("__value__").toString());
            }
        });
    }

    protected void initNumberProto() {
        numberProto.addMethod("constructor", new Method("__value__") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj v = args[0].get("__value__");
                if (v instanceof Value) {
                    Object object = ((Value) v).value;
                    if (object instanceof BigDecimal) {
                        receiver.put("__value__", v);
                        return nullObj;
                    }
                }
                throw new RuntimeException("not implemented");
            }
        });

        numberProto.addMethod("+", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)) {
                    return newNumber(receiver.asBigDecimal().add(
                            rhs.asBigDecimal()));
                } else {
                    return newString(receiver.asBigDecimal() + rhs.asString());
                }
            }
        });

        numberProto.addMethod("-", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)) {
                    return newNumber(receiver.asBigDecimal().subtract(
                            rhs.asBigDecimal()));
                } else {
                    return nullObj;
                }
            }
        });

        numberProto.addMethod("*", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)) {
                    return newNumber(receiver.asBigDecimal().multiply(
                            rhs.asBigDecimal()));
                } else {
                    return nullObj;
                }
            }
        });

        numberProto.addMethod("/", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)) {
                    return newNumber(receiver.asBigDecimal().divide(
                            rhs.asBigDecimal()));
                } else {
                    return nullObj;
                }
            }
        });

        numberProto.addMethod("%", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)) {
                    return newNumber(receiver.asBigDecimal().intValue()
                            % rhs.asBigDecimal().intValue());
                } else {
                    return nullObj;
                }
            }
        });

        numberProto.addMethod("==", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) == 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        numberProto.addMethod("<", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) < 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        numberProto.addMethod(">", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) > 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        numberProto.addMethod("<=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) <= 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        numberProto.addMethod(">=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (numberProto.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) >= 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        numberProto.addMethod("unary_minus", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return newNumber(receiver.asBigDecimal().multiply(
                        new BigDecimal(-1)));
            }
        });

        numberProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return newString(receiver.get("__value__").toString());
            }
        });
    }

    protected void initStringProto() {
        stringProto.addMethod("constructor", new Method("__value__") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj s = args[0].send("toString");
                Obj value = s.get("__value__");
                if (value instanceof Value) {
                    receiver.put("__value__", value);
                }
                return nullObj;
            }
        });

        stringProto.addMethod("+", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                String lhs = receiver.asString();
                if (args[0] != nullObj) {
                    String rhs = args[0].send("toString").asString();
                    return newString(lhs + rhs);
                }
                return receiver;
            }
        });

        stringProto.addMethod("==", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (stringProto.isPrototypeOf(rhs)
                        && receiver.asString().equals(rhs.asString())) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        stringProto.addMethod("<", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (stringProto.isPrototypeOf(rhs)
                        && receiver.asString().compareTo(rhs.asString()) < 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        stringProto.addMethod(">", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (stringProto.isPrototypeOf(rhs)
                        && receiver.asString().compareTo(rhs.asString()) > 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        stringProto.addMethod("<=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (stringProto.isPrototypeOf(rhs)
                        && receiver.asString().compareTo(rhs.asString()) <= 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        stringProto.addMethod(">=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (stringProto.isPrototypeOf(rhs)
                        && receiver.asString().compareTo(rhs.asString()) >= 0) {
                    return trueObj;
                } else {
                    return falseObj;
                }
            }
        });

        stringProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return receiver;
            }
        });
    }

    protected void initPropProto() {

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
        Value value = s == null ? new Value("") : new Value(s);
        Obj obj = new Obj(this, stringProto);
        obj.put("__value__", value);
        return obj;
    }

    public Obj newNumber(BigDecimal d) {
        Value value = d == null ? new Value(0) : new Value(d);
        Obj obj = new Obj(this, numberProto);
        obj.put("__value__", value);
        return obj;
    }

    public Obj newNumber(int i) {
        return newNumber(new BigDecimal(i));
    }

    public Obj newProp(Obj value) {
        Obj getter = value.get("get");
        Obj setter = value.get("set");
        Obj prop = new Obj(this, propProto);
        if (funProto.isPrototypeOf(getter)) {
            prop.put("get", getter);
        }
        if (funProto.isPrototypeOf(setter)) {
            prop.put("set", setter);
        }
        return prop;
    }

    public Obj newClass(String name, Obj prototype) {
        String[] params = new String[] {};
        Obj constructor = prototype.get("constructor");
        if (constructor instanceof Fun) {
            params = ((Fun) constructor).params;
        }
        return new ClassFun(this, currentEnv, params, name, prototype);
    }

    public Obj exec(AttoTree tree) {
        return (Obj) interpreter.exec(tree);
    }

}
