package atto.lang;

public abstract class Method {

    protected String[] params;

    public Method(String... params) {
        this.params = params;
    }

    public abstract Obj call(Obj receiver, Obj[] args);
}
