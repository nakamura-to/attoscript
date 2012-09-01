package atto.lang;

public class PropertyClassBuilder {

    protected Runtime runtime;

    public PropertyClassBuilder(Runtime runtime) {
        this.runtime = runtime;
    }

    public ClassFun build() {
        Obj proto = new Obj(runtime, runtime.objectClass.prototype);

        proto.addMethod("constructor", new Method("options") {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                Obj options = args[0];
                Obj getter = options.get("get");
                Obj setter = options.get("set");
                if (runtime.functionClass.prototype.isPrototypeOf(getter)) {
                    receiver.put("get", getter);
                }
                if (runtime.functionClass.prototype.isPrototypeOf(setter)) {
                    receiver.put("set", setter);
                }
                return runtime.nullObj;
            }
        });

        return (ClassFun) runtime.objectClass.callMethod("clone", proto);
    }
}
