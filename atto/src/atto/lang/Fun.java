package atto.lang;

public abstract class Fun extends Obj {

    protected Runtime runtime;

    protected Env env;

    protected String[] params;

    protected Fun(Runtime runtime, Env env, String[] params) {
        super(runtime, runtime.funProto);
        this.runtime = runtime;
        this.env = env;
        this.params = params;
    }

    public Obj call(Obj receiver, Obj[] args) {
        Env calleeEnv = new Env(runtime, receiver, env);
        Obj it = runtime.nullObj;
        if (args.length > 0) {
            it = args[0];
        }
        calleeEnv.putLocal("it", it);
        calleeEnv.putLocal("self", receiver);
        calleeEnv.putLocal("super", receiver.__proto__);
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
