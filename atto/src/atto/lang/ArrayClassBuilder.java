package atto.lang;

import java.math.BigDecimal;

public class ArrayClassBuilder {

    protected Runtime runtime;

    public ArrayClassBuilder(Runtime runtime) {
        this.runtime = runtime;
    }

    public ClassFun build() {
        final Obj proto = new Obj(runtime, runtime.objectClass.prototype);

        proto.addMethod("constructor", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                receiver.put("length", runtime.newNumber(0));
                return runtime.nullObj;
            }
        });

        proto.addMethod("==", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj other = args[0];
                if (!proto.isPrototypeOf(other)) {
                    return runtime.falseObj;
                }
                BigDecimal length = receiver.getBigDecimal("length");
                BigDecimal otherLength = other.getBigDecimal("length");
                if (length == null || otherLength == null
                        || length.compareTo(otherLength) != 0) {
                    return runtime.falseObj;
                }
                for (int i = 0, len = length.intValue(); i < len; i++) {
                    String key = String.valueOf(i);
                    Obj element = receiver.get(key);
                    Obj otherElement = other.get(key);
                    Obj result = element.callMethod("==", otherElement);
                    if (!result.asBoolean()) {
                        return runtime.falseObj;
                    }
                }
                return runtime.trueObj;
            }
        });

        proto.addMethod("push", new Method("element") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int length = receiver.getBigDecimal("length").intValue();
                receiver.put(String.valueOf(length), args[0]);
                receiver.put("length", runtime.newNumber(length + 1));
                return receiver;
            }
        });

        proto.addMethod("set", new Method("index", "element") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int index = args[0].asBigDecimal().intValue();
                Obj element = args[1];
                int length = receiver.getBigDecimal("length").intValue();
                for (; length < index; length++) {
                    receiver.callMethod("push", runtime.nullObj);
                }
                receiver.put(String.valueOf(index), element);
                receiver.put("length", runtime.newNumber(length + 1));
                return receiver;
            }
        });

        proto.addMethod("get", new Method("index") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int index = args[0].asBigDecimal().intValue();
                Obj element = receiver.get(String.valueOf(index));
                return element == null ? runtime.nullObj : element;
            }
        });

        proto.addMethod("map", new Method("fun") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) args[0];
                int length = receiver.getBigDecimal("length").intValue();
                Obj result = runtime.newArray();
                for (int i = 0; i < length; i++) {
                    Obj key = runtime.newNumber(i);
                    Obj element = receiver.callMethod("get", new Obj[] { key });
                    Obj newElement = fun.call(receiver, new Obj[] { element,
                            key });
                    result.callMethod("push", new Obj[] { newElement });
                }
                result.put("length", runtime.newNumber(length));
                return result;
            }
        });

        proto.addMethod("filter", new Method("fun") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) args[0];
                int length = receiver.getBigDecimal("length").intValue();
                Obj result = runtime.newArray();
                int index = 0;
                for (int i = 0; i < length; i++) {
                    Obj key = runtime.newNumber(i);
                    Obj element = receiver.callMethod("get", new Obj[] { key });
                    Obj bool = fun.call(receiver, new Obj[] { element, key });
                    if (bool == runtime.trueObj) {
                        result.callMethod("push", new Obj[] { element });
                        index++;
                    }
                }
                result.put("length", runtime.newNumber(index));
                return result;
            }
        });

        proto.addMethod("each", new Method("fun") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Fun fun = (Fun) args[0];
                int length = receiver.getBigDecimal("length").intValue();
                for (int i = 0; i < length; i++) {
                    Obj key = runtime.newNumber(i);
                    Obj element = receiver.callMethod("get", new Obj[] { key });
                    fun.call(receiver, new Obj[] { element, key });
                }
                return runtime.nullObj;
            }
        });

        proto.put("forEach", proto.get("each"));

        proto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                int length = receiver.getBigDecimal("length").intValue();
                StringBuilder buf = new StringBuilder();
                buf.append("[");
                for (int i = 0; i < length; i++) {
                    Obj key = runtime.newNumber(i);
                    Obj element = receiver.callMethod("get", new Obj[] { key });
                    Obj string = element.callMethod("toString");
                    buf.append(string.getJavaObject("__value__"));
                    buf.append(", ");
                }
                if (length > 0) {
                    buf.delete(buf.length() - 2, buf.length());
                }
                buf.append("]");
                return runtime.newString(buf.toString());
            }
        });

        return (ClassFun) runtime.objectClass.callMethod("clone", proto);
    }
}
