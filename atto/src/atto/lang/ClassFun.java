package atto.lang;

public class ClassFun extends Fun {

    protected String name;

    protected Obj prototype;

    public ClassFun(Runtime runtime, Env env, String[] params, String name,
            Obj prototype) {
        super(runtime, env, params);
        this.name = name;
        this.prototype = prototype;
        put("prototype", prototype);
    }

    @Override
    protected Obj invoke(Obj receiver, Obj[] args) {
        Obj self = new Obj(runtime, prototype);
        Obj constructor = prototype.get("constructor");
        if (constructor instanceof Fun) {
            ((Fun) constructor).call(self, args);
        }
        return self;
    }

    @Override
    protected Obj applyPartial(Env env, String[] params) {
        Obj constructor = prototype.get("constructor");
        if (constructor instanceof Fun) {
            Obj newConstructor = ((Fun) constructor).applyPartial(env, params);
            prototype.put("prototype", newConstructor);
        }
        return this;
    }
}