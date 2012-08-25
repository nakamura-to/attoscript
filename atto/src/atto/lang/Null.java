package atto.lang;

public class Null extends Obj {

    public Null(Runtime runtime, Obj __proto__) {
        super(runtime, __proto__);
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String toString() {
        return "null";
    }
}
