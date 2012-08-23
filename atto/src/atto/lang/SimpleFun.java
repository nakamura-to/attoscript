package atto.lang;

import atto.AttoTree;
import atto.Env;
import atto.Interpreter;

public class SimpleFun extends Fun {

    private AttoTree body;

    public SimpleFun(Env env, String[] params, AttoTree body) {
        super(env, params);
        this.body = body;
    }

    @Override
    protected Object invoke(Interpreter interpreter) {
        return interpreter.exec(body);
    }

    @Override
    protected Object applyPartial(Env env, String[] params) {
        return new SimpleFun(env, params, body);
    }
}
