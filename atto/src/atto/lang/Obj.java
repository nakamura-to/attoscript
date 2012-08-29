package atto.lang;

import java.util.LinkedHashMap;

public class Obj {

    protected LinkedHashMap<String, Obj> values;

    protected Runtime runtime;

    protected Obj __proto__;

    protected Obj() {
    }

    public Obj(Runtime runtime, Obj __proto__) {
        this.runtime = runtime;
        this.__proto__ = __proto__;
        values = new LinkedHashMap<String, Obj>();
    }

    public void put(String name, Obj value) {
        values.put(name, value);
    }

    public Obj get(String name) {
        Obj value = values.get(name);
        if (value instanceof Obj) {
            return (Obj) value;
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
        // TODO dispatch to method missing
        throw new RuntimeException("not fun: " + name);
    }

    public void addMethod(String name, Method method) {
        Obj fun = new MethodFun(runtime, method);
        values.put(name, fun);
    }

    public String getString(String name) {
        Obj obj = get(name);
        if (obj == null) {
            throw new IllegalArgumentException("name=" + name);
        }
        Obj v = obj.get("__value__");
        if (v instanceof Value) {
            return (String) ((Value) v).value;
        }
        throw new IllegalArgumentException("name=" + name);
    }

    public int getInt(String name) {
        Obj obj = get(name);
        if (obj == null) {
            throw new IllegalArgumentException("name=" + name);
        }
        Obj v = obj.get("__value__");
        if (v instanceof Value) {
            return (Integer) ((Value) v).value;
        }
        throw new IllegalArgumentException("name=" + name);
    }

    public Object asObject() {
        Obj v = get("__value__");
        if (v instanceof Value) {
            return ((Value) v).value;
        }
        throw new RuntimeException();
    }

    public int asInt() {
        Obj v = get("__value__");
        if (v instanceof Value) {
            return (Integer) ((Value) v).value;
        }
        throw new RuntimeException();
    }

    public boolean asBoolean() {
        Obj v = get("__value__");
        if (v instanceof Value) {
            return (Boolean) ((Value) v).value;
        }
        throw new RuntimeException();
    }

    public String asString() {
        Obj v = get("__value__");
        if (v instanceof Value) {
            return (String) ((Value) v).value;
        }
        throw new RuntimeException();
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

}
