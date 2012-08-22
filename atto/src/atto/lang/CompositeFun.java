package atto.lang;

import atto.Interpreter;

public class CompositeFun implements Fun {

    private Fun lhs;

    private Fun rhs;

    public CompositeFun(Fun lhs, Fun rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Object call(Interpreter interpreter, Object[] args) {
        Object result = lhs.call(interpreter, args);
        return rhs.call(interpreter, new Object[] { result });
    }

}
