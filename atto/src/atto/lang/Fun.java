package atto.lang;

import atto.Interpreter;

public interface Fun {

    Object call(Interpreter interpreter, Object[] args);
}
