package atto.lang;

import java.util.Map;

public class ObjectClassBuilder {

    protected Runtime runtime;

    public ObjectClassBuilder(Runtime runtime) {
        this.runtime = runtime;
    }

    public ClassFun build() {
        Obj proto = runtime.objectProto;

        proto.addMethod("==", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj rhs = args[0];
                if (receiver == rhs) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        proto.addMethod("!=", new Method("rhs") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                if (receiver.callMethod("==", args).asBoolean()) {
                    return runtime.falseObj;
                }
                return runtime.trueObj;
            }
        });

        proto.addMethod("clone", new Method("prototype") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj prototype = args[0] == runtime.nullObj ? runtime.newObj()
                        : args[0];
                prototype.__proto__ = receiver.get("prototype");
                String[] params;
                Obj constructor = prototype.get("constructor");
                if (constructor instanceof Fun) {
                    params = ((Fun) constructor).params;
                } else {
                    params = new String[] {};
                }
                return new ClassFun(runtime, runtime.currentEnv, params,
                        prototype);
            }
        });

        proto.addMethod("toString", new Method() {
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
                    if (runtime.stringClass.prototype.isPrototypeOf(value)) {
                        buf.append("\"");
                        buf.append(string.asString());
                        buf.append("\"");
                    } else {
                        buf.append(string.asString());
                    }
                    buf.append(", ");
                }
                if (buf.length() > 3) {
                    buf.delete(buf.length() - 2, buf.length());
                }
                buf.append("}");
                return runtime.newString(buf.toString());
            }
        });

        return new ClassFun(runtime, runtime.currentEnv, new String[] {}, proto);
    }
}
