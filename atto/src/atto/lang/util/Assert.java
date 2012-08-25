package atto.lang.util;

import org.antlr.runtime.tree.CommonTree;

public class Assert {

    public static void treeType(CommonTree t, int type) {
        if (t.getType() != type) {
            throw new AssertionError("t.getType()=" + t.getType() + ", type="
                    + type);
        }
    }

    public static void equals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("expected=" + expected + ", actual="
                    + actual);
        }
    }

    public static void notNull(Object obj) {
        if (obj == null) {
            throw new AssertionError("null");
        }
    }
}
