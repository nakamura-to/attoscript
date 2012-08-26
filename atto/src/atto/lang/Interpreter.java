package atto.lang;

import static atto.AttoParser.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeAdaptor;

import atto.AttoLexer;
import atto.AttoParser;
import atto.AttoTokenSource;
import atto.AttoTree;
import atto.AttoTreeAdaptor;
import atto.lang.util.Assert;

public class Interpreter {

    protected static TreeAdaptor treeAdaptor = new AttoTreeAdaptor();

    protected Runtime runtime;

    public Interpreter() {
    }

    public Obj run(InputStream in) throws RecognitionException, IOException {
        return run(new ANTLRInputStream(in), new PrintWriter(System.out));
    }

    public Obj run(InputStream in, PrintWriter out)
            throws RecognitionException, IOException {
        return run(new ANTLRInputStream(in), out);
    }

    public Obj run(String in) throws RecognitionException, IOException {
        return run(new ANTLRStringStream(in), new PrintWriter(System.out));
    }

    public Obj run(String in, PrintWriter out) throws RecognitionException,
            IOException {
        return run(new ANTLRStringStream(in), out);
    }

    protected Obj run(CharStream in, PrintWriter out)
            throws RecognitionException, IOException {
        AttoLexer lexer = new AttoLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AttoTokenSource source = new AttoTokenSource(tokens);
        tokens = new CommonTokenStream(source);
        AttoParser parser = new AttoParser(tokens);
        parser.setTreeAdaptor(treeAdaptor);
        AttoParser.root_return ret = parser.root();
        if (parser.getNumberOfSyntaxErrors() == 0) {
            if (runtime == null) {
                this.runtime = new Runtime(this, out);
                this.runtime.init();
            }
            AttoTree root = (AttoTree) ret.getTree();
            return (Obj) block(root);
        }
        return null;
    }

    protected Object exec(AttoTree t) {
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
        case ARROW:
            return arrow(t);
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
        case COMPOSITE:
            return composite(t);
        case PIPELINE:
            return pipeline(t);
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
        case AT:
            return at(t);
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

    protected Object block(AttoTree t) {
        Assert.treeType(t, BLOCK);
        Object result = null;
        for (AttoTree c : t.getChildren()) {
            result = exec(c);
        }
        return result;
    }

    protected Object stmt(AttoTree t) {
        Assert.treeType(t, STMT);
        Assert.equals(1, t.getChildCount());
        return exec(t.getChild(0));
    }

    protected Object if_(AttoTree t) {
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

    protected Object elif(AttoTree t) {
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

    protected Object else_(AttoTree t) {
        Assert.treeType(t, ELSE);
        AttoTree body = t.getChild(0);
        Object result = new Object[] { exec(body) };
        return result;
    }

    protected Object while_(AttoTree t) {
        Assert.treeType(t, WHILE);
        AttoTree condition = t.getChild(0);
        AttoTree body = t.getChild(1);
        Object result = null;
        while (toBoolean(exec(condition))) {
            result = exec(body);
        }
        return result;
    }

    protected Object assign(AttoTree t) {
        Assert.treeType(t, ASSIGN);
        AttoTree postfix = t.getChild(0);
        Obj value = (Obj) exec(t.getChild(1));

        switch (postfix.getType()) {
        case NAME: {
            String name = postfix.getText();
            runtime.currentEnv.put(name, value);
            return value;
        }
        case AT: {
            String name = postfix.getChild(0).getText();
            runtime.currentEnv.self.put(name, value);
            return value;
        }
        case INDEX: {
            Obj array = (Obj) exec(postfix.getChild(0));
            if (!runtime.array().isPrototypeOf(array)) {
                throw new RuntimeException("not Array: " + array);
            }
            Obj index = (Obj) exec(postfix.getChild(1));
            if (!runtime.integer().isPrototypeOf(index)) {
                throw new RuntimeException("not Number: " + index);
            }
            return array.send("set", index, value);
        }
        case FIELD_ACCESS: {
            Object maybeObj = exec(postfix.getChild(0));
            if (!(maybeObj instanceof Obj)) {
                throw new RuntimeException("not Obj: " + maybeObj);
            }
            Obj obj = (Obj) maybeObj;
            String name = postfix.getChild(1).getText();
            obj.put(name, value);
            return value;
        }
        default:
            throw new RuntimeException("can't assign: " + postfix.getToken());
        }
    }

    protected Object arrow(AttoTree t) {
        Assert.treeType(t, ARROW);
        String[] params = (String[]) exec(t.getChild(0));
        AttoTree body = t.getChild(1);
        return runtime.newSimpleFun(params, body);
    }

    protected Object params(AttoTree t) {
        Assert.treeType(t, PARAMS);
        int len = t.getChildCount();
        String[] params = new String[len];
        for (int i = 0; i < len; i++) {
            params[i] = t.getChild(i).getText();
        }
        return params;
    }

    protected Object send(AttoTree t) {
        Assert.treeType(t, SEND);
        Obj obj = (Obj) exec(t.getChild(0));
        String name = t.getChild(1).getText();
        Obj[] args = new Obj[t.getChildCount() - 2];
        for (int i = 0; i + 2 < t.getChildCount(); i++) {
            args[i] = (Obj) exec(t.getChild(i + 2));
        }
        return obj.send(name, args);
    }

    protected Object call(AttoTree t) {
        Assert.treeType(t, CALL);
        AttoTree target = t.getChild(0);
        Obj[] args = new Obj[t.getChildCount() - 1];
        for (int i = 0; i + 1 < t.getChildCount(); i++) {
            args[i] = (Obj) exec(t.getChild(i + 1));
        }
        if (target.getType() == FIELD_ACCESS) {
            Obj receiver = (Obj) exec(target.getChild(0));
            String name = target.getChild(1).getText();
            return receiver.send(name, args);
        } else {
            Object maybeFun = exec(target);
            if (!(maybeFun instanceof Fun)) {
                throw new RuntimeException("not function");
            }
            Fun fun = (Fun) maybeFun;
            if (target.getType() == AT) {
                Obj receiver = runtime.currentEnv.self;
                String name = target.getChild(0).getText();
                return receiver.send(name, args);
            } else {
                return fun.call(runtime.nullObj, args);
            }
        }
    }

    protected Object index(AttoTree t) {
        Assert.treeType(t, INDEX);
        Object maybeArray = exec(t.getChild(0));
        if (!(maybeArray instanceof Obj)) {
            throw new RuntimeException("not Array: " + maybeArray);
        }
        Obj array = (Obj) maybeArray;
        Obj index = (Obj) exec(t.getChild(1));
        return array.send("get", index);
    }

    protected Object field_access(AttoTree t) {
        Assert.treeType(t, FIELD_ACCESS);
        Object maybeObj = exec(t.getChild(0));
        if (!(maybeObj instanceof Obj)) {
            throw new RuntimeException("not obj");
        }
        Obj obj = (Obj) maybeObj;
        String name = t.getChild(1).getText();
        return obj.get(name);
    }

    protected Object or(AttoTree t) {
        Assert.treeType(t, OR);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        return toBoolean(lhs) || toBoolean(rhs) ? runtime._true() : runtime
                ._false();
    }

    protected Object and(AttoTree t) {
        Assert.treeType(t, AND);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        return toBoolean(lhs) && toBoolean(rhs) ? runtime._true() : runtime
                ._false();
    }

    public boolean toBoolean(Object value) {
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
        if (value instanceof Obj) {
            Obj o = (Obj) value;
            return toBoolean(o.getObject());
        }
        return true;
    }

    protected Object eq(AttoTree t) {
        Assert.treeType(t, EQ);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs != null && rhs != null) {
            return lhs.equals(rhs) ? runtime._true() : runtime._false();
        }
        return runtime._false();
    }

    protected Object ne(AttoTree t) {
        Assert.treeType(t, NE);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs != null && rhs != null) {
            return lhs.equals(rhs) ? runtime._false() : runtime._true();
        }
        return runtime._false();
    }

    protected Object lt(AttoTree t) {
        Assert.treeType(t, LT);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Comparable && rhs instanceof Comparable) {
            Comparable x = (Comparable) lhs;
            Comparable y = (Comparable) rhs;
            if (x.compareTo(y) < 0) {
                return runtime._true();
            }
        }
        return runtime._false();
    }

    protected Object gt(AttoTree t) {
        Assert.treeType(t, GT);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Comparable && rhs instanceof Comparable) {
            Comparable x = (Comparable) lhs;
            Comparable y = (Comparable) rhs;
            if (x.compareTo(y) > 0) {
                return runtime._true();
            }
        }
        return runtime._false();
    }

    protected Object le(AttoTree t) {
        Assert.treeType(t, LE);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Comparable && rhs instanceof Comparable) {
            Comparable x = (Comparable) lhs;
            Comparable y = (Comparable) rhs;
            if (x.compareTo(y) <= 0) {
                return runtime._true();
            }
        }
        return runtime._false();
    }

    protected Object ge(AttoTree t) {
        Assert.treeType(t, GE);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Comparable && rhs instanceof Comparable) {
            Comparable x = (Comparable) lhs;
            Comparable y = (Comparable) rhs;
            if (x.compareTo(y) >= 0) {
                return runtime._true();
            }
        }
        return runtime._false();
    }

    protected Object composite(AttoTree t) {
        Assert.treeType(t, COMPOSITE);
        Object lhs = exec(t.getChild(0));
        Object rhs = exec(t.getChild(1));
        if (!(lhs instanceof Fun)) {
            throw new RuntimeException("not function");
        }
        Fun first = (Fun) lhs;
        if (!(rhs instanceof Fun)) {
            throw new RuntimeException("not function");
        }
        Fun second = (Fun) rhs;
        return runtime.newCompositeFun(first, second);
    }

    protected Object pipeline(AttoTree t) {
        Assert.treeType(t, PIPELINE);
        Obj[] args = new Obj[] { (Obj) exec(t.getChild(0)) };
        Object maybeFun = exec(t.getChild(1));
        if (!(maybeFun instanceof Fun)) {
            throw new RuntimeException("not function");
        }
        Fun fun = (Fun) maybeFun;
        return fun.call(runtime.nullObj, args);
    }

    protected Object plus(AttoTree t) {
        Assert.treeType(t, PLUS);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return runtime.newInteger((x.intValue() + y.intValue()));
        }
        if (lhs instanceof String || rhs instanceof String) {
            String x = lhs != null ? lhs.toString() : "";
            String y = rhs != null ? rhs.toString() : "";
            return runtime.newString(x + y);
        }
        return 0;
    }

    protected Object minus(AttoTree t) {
        Assert.treeType(t, MINUS);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return runtime.newInteger((x.intValue() - y.intValue()));
        }
        return 0;
    }

    protected Object mul(AttoTree t) {
        Assert.treeType(t, MUL);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return runtime.newInteger((x.intValue() * y.intValue()));
        }
        return 0;
    }

    protected Object div(AttoTree t) {
        Assert.treeType(t, DIV);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return runtime.newInteger((x.intValue() / y.intValue()));
        }
        return 0;
    }

    protected Object mod(AttoTree t) {
        Assert.treeType(t, MOD);
        Object lhs = ((Obj) exec(t.getChild(0))).getObject();
        Object rhs = ((Obj) exec(t.getChild(1))).getObject();
        if (lhs instanceof Integer && rhs instanceof Integer) {
            Integer x = (Integer) lhs;
            Integer y = (Integer) rhs;
            return runtime.newInteger((x.intValue() % y.intValue()));
        }
        return 0;
    }

    protected Object not(AttoTree t) {
        Assert.treeType(t, NOT);
        // TODO
        Object expr = ((Obj) exec(t.getChild(0))).getObject();
        return runtime.newBool(!toBoolean(expr));
    }

    protected Object unary_minus(AttoTree t) {
        Assert.treeType(t, UNARY_MINUS);
        Object expr = ((Obj) exec(t.getChild(0))).getObject();
        if (expr instanceof Integer) {
            Integer x = (Integer) expr;
            return runtime.newInteger(Integer.valueOf(-x.intValue()));
        }
        return 0;
    }

    protected Object int_(AttoTree t) {
        Assert.treeType(t, INT);
        return runtime.newInteger(Integer.valueOf(t.getText()));
    }

    protected Object string(AttoTree t) {
        Assert.treeType(t, STRING);
        String s = t.getText();
        return runtime.newString(s.substring(1, s.length() - 1));
    }

    protected Object bool(AttoTree t) {
        Assert.treeType(t, BOOL);
        return runtime.newBool(Boolean.valueOf(t.getText()));
    }

    protected Object null_(AttoTree t) {
        Assert.treeType(t, NULL);
        return runtime._null();
    }

    protected Object name(AttoTree t) {
        Assert.treeType(t, NAME);
        String name = t.getText();
        Obj value = runtime.currentEnv.get(name);
        if (value == null) {
            throw new RuntimeException("no such variable: " + name + ": "
                    + t.getToken());
        }
        return value;
    }

    protected Object at(AttoTree t) {
        Assert.treeType(t, AT);
        String name = t.getChild(0).getText();
        Obj value = runtime.currentEnv.self.get(name);
        if (value == null) {
            throw new RuntimeException("no such variable: " + name + ": "
                    + t.getToken());
        }
        return value;
    }

    protected Object obj(AttoTree t) {
        Assert.treeType(t, OBJ);
        Obj obj = runtime.newObj();
        for (int i = 0; i < t.getChildCount(); i++) {
            Object[] pair = (Object[]) exec(t.getChild(i));
            obj.put((String) pair[0], (Obj) pair[1]);
        }
        return obj;
    }

    protected Object colon(AttoTree t) {
        Assert.treeType(t, COLON);
        AttoTree lhs = t.getChild(0);
        AttoTree rhs = t.getChild(1);
        if (lhs.getType() != NAME) {
            throw new RuntimeException("key must be NAME token: "
                    + t.getToken());
        }
        String key = lhs.getText();
        Obj value = (Obj) exec(rhs);
        return new Object[] { key, value };
    }

    protected Object array(AttoTree t) {
        Assert.treeType(t, ARRAY);
        Obj array = runtime.newArray();
        int len = t.getChildCount();
        for (int i = 0; i < len; i++) {
            Obj arg = (Obj) exec(t.getChild(i));
            array.values.put(String.valueOf(i), arg);
        }
        array.put("length", runtime.newInteger(len));
        return array;
    }

    protected Object unknown(AttoTree t) {
        throw new RuntimeException("unknown node: " + t.getToken());
    }

}
