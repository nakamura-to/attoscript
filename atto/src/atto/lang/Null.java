package atto.lang;

public class Null extends Obj {

    public Null(Runtime runtime, Obj __proto__) {
        super(runtime, __proto__);
    }

    @Override
    public void put(String name, Obj value) {
        throw new RuntimeException("null reference.");
    }

    @Override
    public Obj get(String name) {
        throw new RuntimeException("null reference.");
    }

    @Override
    public Obj send(String name, Obj... args) {
        throw new RuntimeException("null reference.");
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
