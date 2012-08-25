package atto.lang;

import java.util.HashMap;

import atto.lang.util.Assert;

public class Env {

    protected HashMap<String, Obj> values = new HashMap<String, Obj>();

    protected Env enclosingEnv;

    public Env() {
    }

    public Env(Env enclosingEnv) {
        this.enclosingEnv = enclosingEnv;
    }

    public Obj get(String name) {
        Assert.notNull(name);
        Obj value = values.get(name);
        if (value != null) {
            return value;
        }
        if (enclosingEnv != null) {
            return enclosingEnv.get(name);
        }
        return null;
    }

    public void put(String name, Obj value) {
        Assert.notNull(name);
        Env env = search(name);
        if (env == null) {
            env = this;
        }
        env.putLocal(name, value);
    }

    public void putLocal(String name, Obj value) {
        Assert.notNull(name);
        values.put(name, value);
    }

    protected Env search(String name) {
        Assert.notNull(name);
        if (values.containsKey(name)) {
            return this;
        }
        if (enclosingEnv != null) {
            return enclosingEnv.search(name);
        }
        return null;
    }
}
