package atto.lang;

import atto.AttoTree;

public class SimpleFun extends Fun {

    protected AttoTree body;

    public SimpleFun(Runtime runtime, Env env, String[] params, AttoTree body) {
        super(runtime, env, params);
        this.body = body;
    }

    @Override
    protected Obj invoke(Obj receiver, Obj[] args) {
        return runtime.exec(body);
    }

    @Override
    protected Obj applyPartial(Env env, String[] params) {
        return new SimpleFun(runtime, env, params, body);
    }
}
