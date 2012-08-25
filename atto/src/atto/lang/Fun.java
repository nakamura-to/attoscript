package atto.lang;

public abstract class Fun extends Obj {

    protected Env env;

    protected String[] params;

    protected Fun(Runtime runtime, Env env, String[] params) {
        super(runtime, runtime.fun());
        this.env = env;
        this.params = params;
    }

    public Obj call(Obj receiver, Obj[] args) {
        Env calleeEnv = new Env(env);
        for (int i = 0; i < params.length; i++) {
            if (i < args.length) {
                calleeEnv.putLocal(params[i], args[i]);
            }
        }
        if (args.length < params.length) {
            String[] newParams = new String[params.length - args.length];
            for (int i = 0; i < newParams.length; i++) {
                newParams[i] = params[i + args.length];
            }
            return applyPartial(calleeEnv, newParams);
        }
        Env preservedEnv = runtime.currentEnv;
        runtime.currentEnv = calleeEnv;
        Obj result = invoke(receiver, args);
        runtime.currentEnv = preservedEnv;
        return result;
    }

    protected abstract Obj invoke(Obj receiver, Obj[] args);

    protected abstract Obj applyPartial(Env env, String[] params);

    public Env getEnv() {
        return env;
    }

    public String[] getParams() {
        return params;
    }

}
