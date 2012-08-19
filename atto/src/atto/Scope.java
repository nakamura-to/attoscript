package atto;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {

    String name;
    Scope enclosingScope;
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public Scope() {
        this.name = "global";
    }

    public Scope(Scope enclosingScope) {
        Assert.notNull(enclosingScope);
        this.name = "local";
        this.enclosingScope = enclosingScope;
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public void define(Symbol symbol) {
        Assert.notNull(symbol);
        symbols.put(symbol.name, symbol);
        symbol.scope = this;
    }

    public Symbol resolve(String name) {
        Assert.notNull(name);
        // check this scope
        Symbol symbol = symbols.get(name);
        if (symbol != null) {
            return symbol;
        }
        // check enclosing scope
        Scope scope = getEnclosingScope();
        if (scope != null) {
            return scope.resolve(name);
        }
        // not found
        return null;
    }
}
