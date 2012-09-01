package atto.lang;

import java.math.BigDecimal;

public class NumberClassBuilder {

    protected Runtime runtime;

    public NumberClassBuilder(Runtime runtime) {
        this.runtime = runtime;
    }

    public ClassFun build() {
        final Obj prototype = new Obj(runtime, runtime.objectClass.prototype);

        prototype.addMethod("constructor", new Method("__value__") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Object value = args[0].getJavaObject("__value__");
                if (value instanceof BigDecimal) {
                    receiver.putJavaObject("__value__", value);
                }
                // TODO
                // throw new RuntimeException("not implemented");
                return runtime.nullObj;
            }
        });

        prototype.addMethod("+", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)) {
                    return runtime.newNumber(receiver.asBigDecimal().add(
                            rhs.asBigDecimal()));
                } else {
                    return runtime.newString(receiver.asBigDecimal()
                            + rhs.asString());
                }
            }
        });

        prototype.addMethod("-", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)) {
                    return runtime.newNumber(receiver.asBigDecimal().subtract(
                            rhs.asBigDecimal()));
                } else {
                    return runtime.nullObj;
                }
            }
        });

        prototype.addMethod("*", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)) {
                    return runtime.newNumber(receiver.asBigDecimal().multiply(
                            rhs.asBigDecimal()));
                } else {
                    return runtime.nullObj;
                }
            }
        });

        prototype.addMethod("/", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)) {
                    return runtime.newNumber(receiver.asBigDecimal().divide(
                            rhs.asBigDecimal()));
                } else {
                    return runtime.nullObj;
                }
            }
        });

        prototype.addMethod("%", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)) {
                    return runtime.newNumber(receiver.asBigDecimal().intValue()
                            % rhs.asBigDecimal().intValue());
                } else {
                    return runtime.nullObj;
                }
            }
        });

        prototype.addMethod("==", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) == 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        prototype.addMethod("<", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) < 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        prototype.addMethod(">", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) > 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        prototype.addMethod("<=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) <= 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        prototype.addMethod(">=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (prototype.isPrototypeOf(rhs)
                        && receiver.asBigDecimal()
                                .compareTo(rhs.asBigDecimal()) >= 0) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        prototype.addMethod("unary_minus", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return runtime.newNumber(receiver.asBigDecimal().multiply(
                        new BigDecimal(-1)));
            }
        });

        prototype.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Object value = receiver.getJavaObject("__value__");
                return runtime.newString(value.toString());
            }
        });

        return (ClassFun) runtime.objectClass.callMethod("clone", prototype);
    }
}
