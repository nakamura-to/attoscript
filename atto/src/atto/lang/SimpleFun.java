package atto.lang;

import atto.AttoTree;
import atto.Env;
import atto.Interpreter;

public class SimpleFun implements Fun {

    private Env env;

    private String[] params;

    private AttoTree body;

    public SimpleFun(Env env, String[] params, AttoTree body) {
        this.env = env;
        this.params = params;
        this.body = body;
    }

    public Object call(Interpreter interpreter, Object[] args) {
        Env calleeEnv = new Env(env);
        for (int i = 0, len = params.length; i < len; i++) {
            if (i < args.length) {
                calleeEnv.putLocal(params[i], args[i]);
            }
        }
        Env preservedEnv = interpreter.currentEnv;
        interpreter.currentEnv = calleeEnv;
        Object result = interpreter.exec(body);
        interpreter.currentEnv = preservedEnv;
        return result;
    }

}
