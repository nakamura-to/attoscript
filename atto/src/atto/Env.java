package atto;

import java.util.HashMap;

public class Env {

    HashMap<String, Object> values = new HashMap<String, Object>();

    Env enclosingEnv;

    public Env() {
    }

    public Env(Env enclosingEnv) {
        this.enclosingEnv = enclosingEnv;
    }

    public Object get(String name) {
        Assert.notNull(name);
        Object value = values.get(name);
        if (value != null) {
            return value;
        }
        if (enclosingEnv != null) {
            return enclosingEnv.get(name);
        }
        return null;
    }

    public void put(String name, Object value) {
        Assert.notNull(name);
        Env env = search(name);
        if (env == null) {
            env = this;
        }
        env.putLocal(name, value);
    }

    public void putLocal(String name, Object value) {
        Assert.notNull(name);
        values.put(name, value);
    }

    Env search(String name) {
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
