package atto.lang;

public class BooleanClassBuilder {

    protected Runtime runtime;

    public BooleanClassBuilder(Runtime runtime) {
        this.runtime = runtime;
    }

    public ClassFun build() {
        Obj proto = new Obj(runtime, runtime.objectClass.prototype);

        proto.addMethod("!", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                if (receiver == runtime.trueObj) {
                    return runtime.falseObj;
                } else {
                    return runtime.trueObj;
                }
            }
        });

        proto.addMethod("&&", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                if (receiver == runtime.trueObj && args[0] == runtime.trueObj) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        proto.addMethod("||", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                if (receiver == runtime.trueObj || args[0] == runtime.trueObj) {
                    return runtime.trueObj;
                } else {
                    return runtime.falseObj;
                }
            }
        });

        proto.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return runtime.newString(receiver.get("__value__").toString());
            }
        });

        return (ClassFun) runtime.objectClass.callMethod("clone", proto);
    }
}
