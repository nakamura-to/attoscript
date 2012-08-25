package atto.lang;

public class MethodFun extends Fun {

    private Method method;

    public MethodFun(Runtime runtime, Method method) {
        this(runtime, null, method.params, method);
    }

    protected MethodFun(Runtime runtime, Env env, String[] params, Method method) {
        super(runtime, env, params);
        this.method = method;
    }

    @Override
    protected Obj invoke(Obj receiver, Obj[] args) {
        return method.call(receiver, args);
    }

    @Override
    protected Obj applyPartial(Env env, String[] params) {
        return new MethodFun(runtime, env, params, method);
    }

}
