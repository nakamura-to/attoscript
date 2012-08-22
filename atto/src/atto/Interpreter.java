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
import atto.lang.CompositeFun;
import atto.lang.Fun;
import atto.lang.Obj;
import atto.lang.SimpleFun;

public class Interpreter {

    static TreeAdaptor treeAdaptor = new AttoTreeAdaptor();

    public Env currentEnv = new Env();

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

    public Object exec(AttoTree t) {
        switch (t.getType()) {
        case BLOCK:
            return block(t);
        case STMT:
            return stmt(t);
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
        case COMPOSITE:
            return composite(t);
        case NOT:
            return not(t);
        case UNARY_MINUS:
            return unary_minus(t);
        case PRINT:
            return print(t);
        case CALL:
            return call(t);
        case INDEX:
            return index(t);
        case FIELD_ACCESS:
            return field_access(t);
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
        case OBJ:
            return obj(t);
        case COLON:
            return colon(t);
        case ARRAY:
            return array(t);
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
        AttoTree postfix = t.getChild(0);
        Object value = exec(t.getChild(1));

        switch (postfix.getType()) {
        case NAME: {
            String name = postfix.getText();
            currentEnv.put(name, value);
            return value;
        }
        case INDEX: {
            Object maybeArray = exec(postfix.getChild(0));
            if (!(maybeArray instanceof Array)) {
                throw new RuntimeException("not Array: " + maybeArray);
            }
            Array array = (Array) maybeArray;
            Integer index = (Integer) exec(postfix.getChild(1));
            array.values[index] = value;
            return value;
        }
        case FIELD_ACCESS: {
            Object maybeObj = exec(postfix.getChild(0));
            if (!(maybeObj instanceof Obj)) {
                throw new RuntimeException("not Obj: " + maybeObj);
            }
            Obj obj = (Obj) maybeObj;
            String name = postfix.getChild(1).getText();
            obj.values.put(name, value);
            return value;
        }
        default:
            throw new RuntimeException("can't assign: " + postfix.getToken());
        }
    }

    Object fun(AttoTree t) {
        Assert.treeType(t, FUN);
        String[] params = (String[]) exec(t.getChild(0));
        AttoTree body = t.getChild(1);
        return new SimpleFun(currentEnv, params, body);
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

    Object call(AttoTree t) {
        Assert.treeType(t, CALL);
        Object maybeFun = exec(t.getChild(0));
        Object[] args = new Object[t.getChildCount() - 1];
        for (int i = 0; i + 1 < t.getChildCount(); i++) {
            args[i] = exec(t.getChild(i + 1));
        }
        if (!(maybeFun instanceof Fun)) {
            throw new RuntimeException("not function");
        }
        Fun fun = (Fun) maybeFun;
        return fun.call(this, args);
    }

    Object index(AttoTree t) {
        Assert.treeType(t, INDEX);
        Object maybeArray = exec(t.getChild(0));
        if (!(maybeArray instanceof Array)) {
            throw new RuntimeException("not Array: " + maybeArray);
        }
        Array array = (Array) maybeArray;
        Integer index = (Integer) exec(t.getChild(1));
        return array.values[index];
    }

    Object field_access(AttoTree t) {
        Assert.treeType(t, FIELD_ACCESS);
        Object maybeObj = exec(t.getChild(0));
        if (!(maybeObj instanceof Obj)) {
            throw new RuntimeException("not obj");
        }
        Obj obj = (Obj) maybeObj;
        String name = t.getChild(1).getText();
        return obj.values.get(name);
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

    Object composite(AttoTree t) {
        Assert.treeType(t, COMPOSITE);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (!(lhs instanceof Fun)) {
            throw new RuntimeException("not function");
        }
        Fun lhsFun = (Fun) lhs;
        if (!(rhs instanceof Fun)) {
            throw new RuntimeException("not function");
        }
        Fun rhsFun = (Fun) rhs;
        return new CompositeFun(lhsFun, rhsFun);
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

    Object name(AttoTree t) {
        Assert.treeType(t, NAME);
        String name = t.getText();
        Object value = currentEnv.get(name);
        if (value == null) {
            throw new RuntimeException("no such variable: " + name + ": "
                    + t.getToken());
        }
        return value;
    }

    Object obj(AttoTree t) {
        Assert.treeType(t, OBJ);
        Obj obj = new Obj();
        obj.values = new LinkedHashMap<String, Object>(t.getChildCount());
        for (int i = 0; i < t.getChildCount(); i++) {
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
        for (int i = 0; i < t.getChildCount(); i++) {
            array.values[i] = exec(t.getChild(i));
        }
        return array;
    }

    Object unknown(AttoTree t) {
        throw new RuntimeException("unknown node: " + t.getToken());
    }

}
