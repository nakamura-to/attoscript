package atto;

import static atto.AttoParser.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeAdaptor;

import atto.lang.Array;
import atto.lang.Fun;
import atto.lang.Obj;

public class Interpreter {

    static TreeAdaptor treeAdaptor = new AttoTreeAdaptor();

    Env currentEnv = new Env();

    AttoTree root;

    PrintWriter out;

    public Interpreter() {
        this(System.out);
    }

    public Interpreter(OutputStream out) {
        this.out = new PrintWriter(out);
    }

    public Interpreter(Writer out) {
        this.out = new PrintWriter(out);
    }

    public Object run(InputStream input) throws RecognitionException,
            IOException {
        return run(new ANTLRInputStream(input));
    }

    public Object run(String input) throws RecognitionException, IOException {
        return run(new ANTLRStringStream(input));
    }

    Object run(CharStream input) throws RecognitionException, IOException {
        AttoLexer lexer = new AttoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AttoTokenSource source = new AttoTokenSource(tokens);
        tokens = new CommonTokenStream(source);
        AttoParser parser = new AttoParser(tokens);
        parser.setTreeAdaptor(treeAdaptor);
        AttoParser.root_return ret = parser.root();
        if (parser.getNumberOfSyntaxErrors() == 0) {
            root = (AttoTree) ret.getTree();
            return block(root);
        }
        return null;
    }

    Object exec(AttoTree t) {
        switch (t.getType()) {
        case BLOCK:
            return block(t);
        case STMT:
            return stmt(t);
        case OBJ:
            return obj(t);
        case COLON:
            return colon(t);
        case ARRAY:
            return array(t);
        case IF:
            return if_(t);
        case ELIF:
            return elif(t);
        case ELSE:
            return else_(t);
        case WHILE:
            return while_(t);
        case ASSIGN:
            return assign(t);
        case FUN:
            return fun(t);
        case PARAMS:
            return params(t);
        case OR:
            return or(t);
        case AND:
            return and(t);
        case EQ:
            return eq(t);
        case NE:
            return ne(t);
        case LT:
            return lt(t);
        case GT:
            return gt(t);
        case LE:
            return le(t);
        case GE:
            return ge(t);
        case PLUS:
            return plus(t);
        case MINUS:
            return minus(t);
        case MUL:
            return mul(t);
        case DIV:
            return div(t);
        case MOD:
            return mod(t);
        case NOT:
            return not(t);
        case UNARY_MINUS:
            return unary_minus(t);
        case PRINT:
            return print(t);
        case PRIMARY:
            return primary(t);
        case ARGS:
            return args(t);
        case INDEX:
            return index(t);
        case INT:
            return int_(t);
        case STRING:
            return string(t);
        case BOOL:
            return bool(t);
        case NULL:
            return null_(t);
        case NAME:
            return name(t);
        case DOT:
            return dot(t);
        default:
            return unknown(t);
        }
    }

    Object block(AttoTree t) {
        Assert.treeType(t, BLOCK);
        Object result = null;
        for (AttoTree c : t.getChildren()) {
            result = exec(c);
        }
        return result;
    }

    Object stmt(AttoTree t) {
        Assert.treeType(t, STMT);
        Assert.equals(1, t.getChildCount());
        return exec(t.getChild(0));
    }

    Object obj(AttoTree t) {
        Assert.treeType(t, OBJ);
        Obj obj = new Obj();
        obj.values = new LinkedHashMap<String, Object>(t.getChildCount());
        for (int i = 0, len = t.getChildCount(); i < len; i++) {
            Object[] pair = (Object[]) exec(t.getChild(i));
            obj.values.put((String) pair[0], pair[1]);
        }
        return obj;
    }

    Object colon(AttoTree t) {
        Assert.treeType(t, COLON);
        AttoTree lhs = t.getChild(0);
        AttoTree rhs = t.getChild(1);
        if (lhs.getType() != NAME) {
            throw new RuntimeException("key must be NAME token: "
                    + t.getToken());
        }
        String key = lhs.getText();
        Object value = exec(rhs);
        return new Object[] { key, value };
    }

    Object array(AttoTree t) {
        Assert.treeType(t, ARRAY);
        Array array = new Array();
        array.values = new Object[t.getChildCount()];
        int i = 0;
        for (AttoTree c : t.getChildren()) {
            array.values[i++] = exec(c);
        }
        return array;
    }

    Object if_(AttoTree t) {
        Assert.treeType(t, IF);
        AttoTree condition = t.getChild(0);
        AttoTree body = t.getChild(1);
        List<AttoTree> otherConditions = new ArrayList<AttoTree>();
        for (int i = 2; i < t.getChildCount(); i++) {
            otherConditions.add(t.getChild(i));
        }
        Object result = null;
        if (toBoolean(exec(condition))) {
            result = exec(body);
        } else {
            for (AttoTree c : otherConditions) {
                Object[] otherResult = null;
                otherResult = (Object[]) exec(c);
                if (otherResult.length > 0) {
                    result = otherResult[0];
                    break;
                }
            }
        }
        return result;
    }

    Object elif(AttoTree t) {
        Assert.treeType(t, ELIF);
        AttoTree condition = t.getChild(0);
        AttoTree body = t.getChild(1);
        Object result = null;
        if (toBoolean(exec(condition))) {
            result = new Object[] { exec(body) };
        } else {
            result = new Object[] {};
        }
        return result;
    }

    Object else_(AttoTree t) {
        Assert.treeType(t, ELSE);
        AttoTree body = t.getChild(0);
        Object result = new Object[] { exec(body) };
        return result;
    }

    Object while_(AttoTree t) {
        Assert.treeType(t, WHILE);
        AttoTree condition = t.getChild(0);
        AttoTree body = t.getChild(1);
        Object result = null;
        while (toBoolean(exec(condition))) {
            result = exec(body);
        }
        return result;
    }

    Object assign(AttoTree t) {
        Assert.treeType(t, ASSIGN);
        AttoTree primary = t.getChild(0);
        Object assignValue = exec(t.getChild(1));
        AttoTree postfix = null;

        if (primary.getChildCount() == 1) {
            // no postfix. simple assign
            // TODO
            String name = primary.getChild(0).getText();
            currentEnv.put(name, assignValue);
        } else {
            // has postfix.
            Object assignTarget = exec(primary.getChild(0));
            for (int i = 1; i < primary.getChildCount() - 1; i++) {
                postfix = primary.getChild(i);
                Object postfixValue = exec(postfix);
                if (postfix.getType() == ARGS) {
                    assignTarget = _call(assignTarget, postfixValue);
                } else if (postfix.getType() == INDEX) {
                    assignTarget = _index(assignTarget, postfixValue);
                } else if (postfix.getType() == DOT) {
                    assignTarget = _load(assignTarget, postfixValue);
                } else {
                    throw new RuntimeException("unknown postfix: " + postfix);
                }
            }
            // handle last postfix
            postfix = primary.getChild(primary.getChildCount() - 1);
            if (postfix.getType() == INDEX) {
                if (!(assignTarget instanceof Array)) {
                    throw new RuntimeException("not Array: " + assignTarget);
                }
                Array obj = (Array) assignTarget;
                Integer index = (Integer) exec(postfix);
                obj.values[index] = assignValue;
            } else if (postfix.getType() == DOT) {
                if (!(assignTarget instanceof Obj)) {
                    throw new RuntimeException("not Obj: " + assignTarget);
                }
                Obj obj = (Obj) assignTarget;
                // TODO
                String name = postfix.getChild(0).getText();
                obj.values.put(name, assignValue);
            } else {
                throw new RuntimeException("unknown postfix: " + postfix);
            }
        }
        return assignValue;
    }

    Object fun(AttoTree t) {
        Assert.treeType(t, FUN);
        Fun fun = new Fun();
        fun.env = currentEnv;
        fun.params = (String[]) exec(t.getChild(0));
        fun.body = t.getChild(1);
        return fun;
    }

    Object params(AttoTree t) {
        Assert.treeType(t, PARAMS);
        int len = t.getChildCount();
        String[] params = new String[len];
        for (int i = 0; i < len; i++) {
            params[i] = t.getChild(i).getText();
        }
        return params;
    }

    Object primary(AttoTree t) {
        Assert.treeType(t, PRIMARY);
        Object result = exec(t.getChild(0));
        for (int i = 1; i < t.getChildCount(); i++) {
            AttoTree postfix = t.getChild(i);
            Object value = exec(postfix);
            if (postfix.getType() == ARGS) {
                // call
                result = _call(result, value);
            } else if (postfix.getType() == INDEX) {
                // array
                result = _index(result, value);
            } else if (postfix.getType() == DOT) {
                // field
                result = _load(result, value);
            }
        }
        return result;
    }

    Object _call(Object result, Object value) {
        if (!(result instanceof Fun)) {
            throw new RuntimeException("not function");
        }
        Fun fun = (Fun) result;
        Env calleeEnv = new Env(fun.env);
        Object[] args = (Object[]) value;
        for (int j = 0, len = fun.params.length; j < len; j++) {
            if (j < args.length) {
                calleeEnv.putLocal(fun.params[j], args[j]);
            }
        }
        Env preservedEnv = currentEnv;
        currentEnv = calleeEnv;
        Object ret = exec(fun.body);
        currentEnv = preservedEnv;
        return ret;
    }

    Object _index(Object result, Object value) {
        if (!(result instanceof Array)) {
            throw new RuntimeException("not array");
        }
        Array array = (Array) result;
        Integer index = (Integer) value;
        return array.values[index];
    }

    Object _load(Object result, Object value) {
        if (!(result instanceof Obj)) {
            throw new RuntimeException("not obj");
        }
        Obj obj = (Obj) result;
        String name = (String) value;
        return obj.values.get(name);
    }

    Object args(AttoTree t) {
        Assert.treeType(t, ARGS);
        Object[] args = new Object[t.getChildCount()];
        for (int i = 0; i < t.getChildCount(); i++) {
            args[i] = exec(t.getChild(i));
        }
        return args;
    }

    Object index(AttoTree t) {
        Assert.treeType(t, INDEX);
        Object index = exec(t.getChild(0));
        if (!(index instanceof Integer)) {
            throw new RuntimeException("not number");
        }
        return index;
    }

    Object or(AttoTree t) {
        Assert.treeType(t, OR);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        return toBoolean(lhs) || toBoolean(rhs);
    }

    Object and(AttoTree t) {
        Assert.treeType(t, AND);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        return toBoolean(lhs) && toBoolean(rhs);
    }

    boolean toBoolean(Object value) {
        if (value == null) {
            return false;
        }
        if (Boolean.FALSE.equals(value)) {
            return false;
        }
        if (Integer.valueOf(0).equals(value)) {
            return false;
        }
        if ("".equals(value)) {
            return false;
        }
        return true;
    }

    Object eq(AttoTree t) {
        Assert.treeType(t, EQ);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        return lhs.equals(rhs);
    }

    Object ne(AttoTree t) {
        Assert.treeType(t, NE);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        return !lhs.equals(rhs);
    }

    Object lt(AttoTree t) {
        Assert.treeType(t, LT);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Comparable && rhs instanceof Comparable) {
            Comparable x = (Comparable) lhs;
            Comparable y = (Comparable) rhs;
            if (x.compareTo(y) < 0) {
                return true;
            }
        }
        return false;
    }

    Object gt(AttoTree t) {
        Assert.treeType(t, GT);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Comparable && rhs instanceof Comparable) {
            Comparable x = (Comparable) lhs;
            Comparable y = (Comparable) rhs;
            if (x.compareTo(y) > 0) {
                return true;
            }
        }
        return false;
    }

    Object le(AttoTree t) {
        Assert.treeType(t, LE);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Comparable && rhs instanceof Comparable) {
            Comparable x = (Comparable) lhs;
            Comparable y = (Comparable) rhs;
            if (x.compareTo(y) <= 0) {
                return true;
            }
        }
        return false;
    }

    Object ge(AttoTree t) {
        Assert.treeType(t, GE);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Comparable && rhs instanceof Comparable) {
            Comparable x = (Comparable) lhs;
            Comparable y = (Comparable) rhs;
            if (x.compareTo(y) >= 0) {
                return true;
            }
        }
        return false;
    }

    Object plus(AttoTree t) {
        Assert.treeType(t, PLUS);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return Integer.valueOf(x.intValue() + y.intValue());
        }
        if (lhs instanceof String || rhs instanceof String) {
            String x = lhs != null ? lhs.toString() : "";
            String y = rhs != null ? rhs.toString() : "";
            return x + y;
        }
        return 0;
    }

    Object minus(AttoTree t) {
        Assert.treeType(t, MINUS);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return Integer.valueOf(x.intValue() - y.intValue());
        }
        return 0;
    }

    Object mul(AttoTree t) {
        Assert.treeType(t, MUL);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return Integer.valueOf(x.intValue() * y.intValue());
        }
        return 0;
    }

    Object div(AttoTree t) {
        Assert.treeType(t, DIV);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return Integer.valueOf(x.intValue() / y.intValue());
        }
        return 0;
    }

    Object mod(AttoTree t) {
        Assert.treeType(t, MOD);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return Integer.valueOf((x.intValue() % y.intValue()));
        }
        return 0;
    }

    Object not(AttoTree t) {
        Assert.treeType(t, NOT);
        AttoTree expr = t.getChild(0);
        return !toBoolean(exec(expr));
    }

    Object unary_minus(AttoTree t) {
        Assert.treeType(t, UNARY_MINUS);
        Object expr = exec(t.getChild(0));
        if (expr instanceof Integer) {
            Integer x = (Integer) expr;
            return Integer.valueOf(-x.intValue());
        }
        return 0;
    }

    Object print(AttoTree t) {
        Assert.treeType(t, PRINT);
        AttoTree expr = t.getChild(0);
        Object value = exec(expr);
        out.println(value);
        out.flush();
        return value;
    }

    Object int_(AttoTree t) {
        Assert.treeType(t, INT);
        return Integer.valueOf(t.getText());
    }

    Object string(AttoTree t) {
        Assert.treeType(t, STRING);
        String s = t.getText();
        return s.substring(1, s.length() - 1);
    }

    Object bool(AttoTree t) {
        Assert.treeType(t, BOOL);
        return Boolean.valueOf(t.getText());
    }

    Object null_(AttoTree t) {
        Assert.treeType(t, NULL);
        return null;
    }

    // TODO we need a rule to distinguish between ref and def
    Object name(AttoTree t) {
        Assert.treeType(t, NAME);
        return load(t);
    }

    Object dot(AttoTree t) {
        Assert.treeType(t, DOT);
        return t.getChild(0).getText();
    }

    Object unknown(AttoTree t) {
        throw new RuntimeException("unknown node: " + t.getToken());
    }

    // TODO: should return atto.lnag.Obj ?
    Object load(AttoTree t) {
        String name = t.getText();
        Object value = currentEnv.get(name);
        if (value == null) {
            throw new RuntimeException("no such variable: " + name + ": "
                    + t.getToken());
        }
        return value;
    }

}
