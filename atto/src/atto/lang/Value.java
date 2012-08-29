package atto.lang;

import atto.lang.util.Assert;

public class Value extends Obj {

    protected Object value;

    public Value(Object value) {
        Assert.notNull(value);
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
