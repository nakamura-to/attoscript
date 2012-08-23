package atto.lang;

import atto.Env;
import atto.Interpreter;

public abstract class Fun {

    protected Env env;

    protected String[] params;

    protected Fun(Env env, String[] params) {
        this.env = env;
        this.params = params;
    }

    public Object call(Interpreter interpreter, Object[] args) {
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
        Env preservedEnv = interpreter.currentEnv;
        interpreter.currentEnv = calleeEnv;
        Object result = invoke(interpreter);
        interpreter.currentEnv = preservedEnv;
        return result;
    }

    protected abstract Object invoke(Interpreter interpreter);

    protected abstract Object applyPartial(Env env, String[] params);

    public Env getEnv() {
        return env;
    }

    public String[] getParams() {
        return params;
    }

}
