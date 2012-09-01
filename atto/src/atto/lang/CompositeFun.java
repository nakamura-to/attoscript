package atto.lang;

public class CompositeFun extends Fun {

    protected Fun first;

    protected Fun second;

    public CompositeFun(Runtime runtime, Env env, Fun first, Fun second) {
        this(runtime, env, first.params, first, second);
    }

    protected CompositeFun(Runtime runtime, Env env, String[] params,
            Fun first, Fun second) {
        super(runtime, env, params);
        this.first = first;
        this.second = second;
    }

    @Override
    protected Obj invoke(Obj receiver, Obj[] args) {
        Obj result = first.call(receiver, args);
        return second.call(receiver, new Obj[] { result });
    }

    @Override
    protected Obj applyPartial(Env env, String[] params) {
        return new CompositeFun(runtime, env, first, second);
    }
}
