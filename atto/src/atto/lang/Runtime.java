package atto.lang;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Map;

import org.antlr.runtime.RecognitionException;

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
    protected ClassFun propClass;

    public Runtime(Interpreter interpreter, PrintWriter out) {
        this.interpreter = interpreter;
        this.out = out;
    }

    public void init() throws IOException, RecognitionException {
        currentEnv = new Env(this);

        objProto = new Obj(this, null);
        funProto = new Obj(this, objProto);
        arrayProto = new Obj(this, objProto);
        boolProto = new Obj(this, objProto);
        numberProto = new Obj(this, objProto);
        stringProto = new Obj(this, objProto);
        propProto = new Obj(this, objProto); // TODO

        objClass = new ClassFun(this, currentEnv, new String[] {}, objProto);
        funClass = new ClassFun(this, currentEnv, new String[] {}, funProto);
        arrayClass = new ClassFun(this, currentEnv, new String[] {}, arrayProto);
        boolClass = new ClassFun(this, currentEnv,
                new String[] { "__value__" }, boolProto);
        numberClass = new ClassFun(this, currentEnv,
                new String[] { "__value__" }, numberProto);
        stringClass = new ClassFun(this, currentEnv, new String[] {},
                stringProto);
        propClass = new ClassFun(this, currentEnv, new String[] {}, propProto);

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
        trueObj.putJavaObject("__value__", Boolean.TRUE);
        falseObj = new Obj(this, boolProto);
        falseObj.putJavaObject("__value__", Boolean.FALSE);

        // built-in constructors
        currentEnv.put("Object", objClass);
        currentEnv.put("Function", funClass);
        currentEnv.put("Array", arrayClass);
        currentEnv.put("Boolean", boolClass);
        currentEnv.put("Number", numberClass);
        currentEnv.put("String", stringClass);
        currentEnv.put("Property", propClass);

        // built-in function
        currentEnv.put("print", new BuiltinFun.PrintFun(this, out));
        currentEnv.put("assert", new BuiltinFun.AssertFun(this, out));

        // Interpreter system = new Interpreter();
        // system.runtime = this;
        // InputStream stream = Thread.currentThread().getContextClassLoader()
        // .getResourceAsStream("atto/lang/system.atto");
        // if (stream == null) {
        // throw new RuntimeException("system.atto not found");
        // }
        // try {
        // system.run(stream);
        // } finally {
        // try {
        // stream.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }

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
                if (receiver.callMethod("==", args).asBoolean()) {
                    return falseObj;
                }
                return trueObj;
            }
        });

        objProto.addMethod("clone", new Method("prototype") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj prototype = args[0];
                prototype.__proto__ = receiver.get("prototype");
                return newClass(prototype);
            }
        });

        objProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                StringBuilder buf = new StringBuilder();
                buf.append("{");
                for (Map.Entry<String, Object> e : receiver.values.entrySet()) {
                    String key = e.getKey();
                    buf.append(key);
                    buf.append(": ");
                    Object v = e.getValue();
                    if (!(v instanceof Obj)) {
                        continue;
                    }
                    Obj value = (Obj) v;
                    Obj string = value.callMethod("toString");
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
                    Obj element = receiver.get(key);
                    Obj otherElement = other.get(key);
                    Obj result = element.callMethod("==", otherElement);
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
                    receiver.callMethod("push", nullObj);
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
                    Obj element = receiver.callMethod("get", new Obj[] { key });
                    Obj newElement = fun.call(receiver, new Obj[] { element,
                            key });
                    result.callMethod("push", new Obj[] { newElement });
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
                    Obj element = receiver.callMethod("get", new Obj[] { key });
                    Obj bool = fun.call(receiver, new Obj[] { element, key });
                    if (bool == trueObj) {
                        result.callMethod("push", new Obj[] { element });
                        index++;
                    }
                }
                result.put("length", newNumber(index));
                return result;
            }
        });

        arrayProto.addMethod("each", new Method("fun") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) args[0];
                int length = receiver.getBigDecimal("length").intValue();
                for (int i = 0; i < length; i++) {
                    Obj key = newNumber(i);
                    Obj element = receiver.callMethod("get", new Obj[] { key });
                    fun.call(receiver, new Obj[] { element, key });
                }
                return nullObj;
            }
        });

        arrayProto.put("forEach", arrayProto.get("each"));

        arrayProto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int length = receiver.getBigDecimal("length").intValue();
                StringBuilder buf = new StringBuilder();
                buf.append("[");
                for (int i = 0; i < length; i++) {
                    Obj key = newNumber(i);
                    Obj element = receiver.callMethod("get", new Obj[] { key });
                    Obj string = element.callMethod("toString");
                    buf.append(string.getJavaObject("__value__"));
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

    protected void initFunProto() {
        funProto.addMethod("|>", new Method("arg") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) receiver;
                return fun.apply(nullObj, args);
            }
        });

        funProto.addMethod("<|", new Method("arg") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) receiver;
                return fun.apply(nullObj, args);
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
                Object value = args[0].getJavaObject("__value__");
                if (value instanceof BigDecimal) {
                    receiver.putJavaObject("__value__", value);
                    return nullObj;
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
                Object value = receiver.getJavaObject("__value__");
                return newString(value.toString());
            }
        });
    }

    protected void initStringProto() {
        stringProto.addMethod("constructor", new Method("__value__") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj s = args[0].callMethod("toString");
                Object value = s.getJavaObject("__value__");
                if (value instanceof String) {
                    receiver.putJavaObject("__value__", value);
                }
                return nullObj;
            }
        });

        stringProto.addMethod("+", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                String lhs = receiver.asString();
                if (args[0] != nullObj) {
                    String rhs = args[0].callMethod("toString").asString();
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
        propProto.addMethod("constructor", new Method("__value__") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj options = args[0];
                Obj getter = options.get("get");
                Obj setter = options.get("set");
                if (funProto.isPrototypeOf(getter)) {
                    receiver.put("get", getter);
                }
                if (funProto.isPrototypeOf(setter)) {
                    receiver.put("set", setter);
                }
                return nullObj;
            }
        });
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
        Obj obj = new Obj(this, stringProto);
        obj.putJavaObject("__value__", s == null ? "" : s);
        return obj;
    }

    public Obj newNumber(BigDecimal d) {
        Obj obj = new Obj(this, numberProto);
        obj.putJavaObject("__value__", d == null ? BigDecimal.ZERO : d);
        return obj;
    }

    public Obj newNumber(int i) {
        return newNumber(new BigDecimal(i));
    }

    public Obj newClass(Obj prototype) {
        String[] params = new String[] {};
        Obj constructor = prototype.get("constructor");
        if (constructor instanceof Fun) {
            params = ((Fun) constructor).params;
        }
        return new ClassFun(this, currentEnv, params, prototype);
    }

    public Obj exec(AttoTree tree) {
        return (Obj) interpreter.exec(tree);
    }

}
