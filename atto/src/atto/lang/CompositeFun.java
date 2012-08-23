package atto.lang;

import atto.Env;
import atto.Interpreter;

public class CompositeFun extends Fun {

    private Fun first;

    private Fun second;

    public CompositeFun(Env env, Fun first, Fun second) {
        this(env, first.getParams(), first, second);
    }

    private CompositeFun(Env env, String[] params, Fun first, Fun second) {
        super(env, params);
        this.first = first;
        this.second = second;
    }

    @Override
    protected Object invoke(Interpreter interpreter) {
        Object[] args = new Object[params.length];
        for (int i = 0; i < args.length; i++) {
            args[i] = interpreter.currentEnv.get(params[i]);
        }
        Object result = first.call(interpreter, args);
        return second.call(interpreter, new Object[] { result });
    }

    @Override
    protected Object applyPartial(Env env, String[] params) {
        return new CompositeFun(env, first, second);
    }
}
