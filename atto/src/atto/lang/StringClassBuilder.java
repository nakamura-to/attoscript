package atto.lang;

public class StringClassBuilder {

    protected Runtime runtime;

    public StringClassBuilder(Runtime runtime) {
        this.runtime = runtime;
    }

    public ClassFun build() {
        final Obj proto = new Obj(runtime, runtime.objectClass.prototype);

        proto.addMethod("constructor", new Method("__value__") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj s = args[0].callMethod("toString");
                Object value = s.getJavaObject("__value__");
                if (value instanceof String) {
                    receiver.putJavaObject("__value__", value);
                }
                return runtime.nullObj;
            }
        });

        proto.addMethod("+", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                String lhs = receiver.asString();
                if (args[0] != runtime.nullObj) {
                    String rhs = args[0].callMethod("toString").asString();
                    return runtime.newString(lhs + rhs);
                }
                return receiver;
            }
        });

        proto.addMethod("==", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (proto.isPrototypeOf(rhs)
                        && receiver.asString().equals(rhs.asString())) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        proto.addMethod("<", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (proto.isPrototypeOf(rhs)
                        && receiver.asString().compareTo(rhs.asString()) < 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        proto.addMethod(">", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (proto.isPrototypeOf(rhs)
                        && receiver.asString().compareTo(rhs.asString()) > 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        proto.addMethod("<=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (proto.isPrototypeOf(rhs)
                        && receiver.asString().compareTo(rhs.asString()) <= 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        proto.addMethod(">=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (proto.isPrototypeOf(rhs)
                        && receiver.asString().compareTo(rhs.asString()) >= 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        proto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return receiver;
            }
        });

        return (ClassFun) runtime.objectClass.callMethod("clone", proto);
    }
}
