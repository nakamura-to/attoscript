package atto.lang;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class Obj {

    protected LinkedHashMap<String, Object> values = new LinkedHashMap<String, Object>();

    protected Runtime runtime;

    protected Obj __proto__;

    public Obj(Runtime runtime, Obj __proto__) {
        this.runtime = runtime;
        this.__proto__ = __proto__;
    }

    public void put(String name, Obj value) {
        values.put(name, value);
    }

    public Obj get(String name) {
        Object value = values.get(name);
        if (value instanceof Obj) {
            return (Obj) value;
        }
        if (__proto__ != null) {
            return __proto__.get(name);
        }
        return null;
    }

    public void putJavaObject(String name, Object value) {
        values.put(name, value);
    }

    public Object getJavaObject(String name) {
        Object value = values.get(name);
        if (value != null) {
            return value;
        }
        if (__proto__ != null) {
            return __proto__.get(name);
        }
        return null;
    }

    public Obj callMethod(String name, Obj... args) {
        Obj method = get(name);
        if (method instanceof Fun) {
            Fun fun = (Fun) method;
            return fun.call(this, args);
        }
        // TODO dispatch to method missing
        throw new RuntimeException("not fun: " + name);
    }

    public Obj applyMethod(String name, Obj... args) {
        Obj method = get(name);
        if (method instanceof Fun) {
            Fun fun = (Fun) method;
            return fun.apply(this, args);
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
            return null;
        }
        return obj.asString();
    }

    public BigDecimal getBigDecimal(String name) {
        Obj obj = get(name);
        if (obj == null) {
            return null;
        }
        return obj.asBigDecimal();
    }

    public Object asObject() {
        return getJavaObject("__value__");
    }

    public BigDecimal asBigDecimal() {
        Object value = asObject();
        if (value instanceof BigDecimal) {
            return (BigDecimal) value;
        }
        throw new RuntimeException();
    }

    public boolean asBoolean() {
        Object value = asObject();
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        throw new RuntimeException();
    }

    public String asString() {
        Object value = asObject();
        if (value instanceof String) {
            return (String) value;
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

    @Override
    public String toString() {
        return values.toString();
    }

}
