package atto.lang;

import java.util.LinkedHashMap;

import atto.lang.util.Assert;

public class Obj {

    protected LinkedHashMap<String, Obj> values = new LinkedHashMap<String, Obj>();

    protected Obj __proto__;

    protected Object object;

    protected Runtime runtime;

    public Obj(Runtime runtime) {
        this(runtime, null, null);
    }

    public Obj(Runtime runtime, Obj __proto__) {
        this(runtime, __proto__, null);
    }

    public Obj(Runtime runtime, Obj __proto__, Object object) {
        Assert.notNull(runtime);
        this.runtime = runtime;
        this.__proto__ = __proto__;
        this.object = object;
    }

    public void put(String name, Obj value) {
        values.put(name, value);
    }

    public Obj get(String name) {
        Obj value = values.get(name);
        if (value != null) {
            return value;
        }
        if (__proto__ == null) {
            return null;
        }
        return __proto__.get(name);
    }

    public Obj send(String name, Obj... args) {
        Obj method = get(name);
        if (method instanceof Fun) {
            Fun fun = (Fun) method;
            return fun.call(this, args);
        }
        throw new RuntimeException("not fun: " + name);
    }

    public void addMethod(String name, Method method) {
        Obj fun = new MethodFun(runtime, method);
        values.put(name, fun);
    }

    public String getString(String name) {
        Obj obj = get("name");
        if (obj == null) {
            throw new IllegalArgumentException("name=" + name);
        }
        if (obj.object == null) {
            throw new IllegalArgumentException("name=" + name);
        }
        return (String) obj.object;
    }

    public int getInt(String name) {
        Obj obj = get(name);
        if (obj == null) {
            throw new IllegalArgumentException("name=" + name);
        }
        if (obj.object == null) {
            throw new IllegalArgumentException("name=" + name);
        }
        return (Integer) obj.object;
    }

    public Object getObject() {
        return object;
    }

    public int getInt() {
        return (Integer) object;
    }

    public boolean isPrototypeOf(Obj obj) {
        if (obj == null) {
            return false;
        }
        for (Obj p = obj; p != null; p = p.__proto__) {
            if (p == this) {
                return true;
            }
        }
        return false;
    }

    public boolean isNull() {
        return false;
    }

}
