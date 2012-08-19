package atto;

public class Symbol {

    String name;
    Scope scope;

    public Symbol(String name) {
        Assert.notNull(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
