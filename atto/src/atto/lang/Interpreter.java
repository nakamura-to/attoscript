package atto.lang;

import static atto.AttoParser.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeAdaptor;

import atto.AttoLexer;
import atto.AttoParser;
import atto.AttoTree;
import atto.AttoTreeAdaptor;
import atto.lang.util.Assert;

public class Interpreter {

    protected static TreeAdaptor treeAdaptor = new AttoTreeAdaptor();

    protected Runtime runtime;

    public Interpreter() {
    }

    public Obj run(InputStream in) {
        try {
            return run(new ANTLRInputStream(in), new PrintWriter(System.out));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Obj run(InputStream in, PrintWriter out) {
        try {
            return run(new ANTLRInputStream(in), out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Obj run(String in) {
        return run(new ANTLRStringStream(in), new PrintWriter(System.out));
    }

    public Obj run(String in, PrintWriter out) {
        return run(new ANTLRStringStream(in), out);
    }

    protected Obj run(CharStream in, PrintWriter out) {
        AttoLexer lexer = new AttoLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AttoParser parser = new AttoParser(tokens);
        parser.setTreeAdaptor(treeAdaptor);
        AttoParser.root_return ret;
        try {
            ret = parser.root();
        } catch (RecognitionException e) {
            throw new RuntimeException(e);
        }
        if (parser.getNumberOfSyntaxErrors() == 0) {
            if (runtime == null) {
                this.runtime = new Runtime(this, out);
                this.runtime.init();
            }
            AttoTree root = (AttoTree) ret.getTree();
            return (Obj) block(root);
        }
        throw new RuntimeException("SyntaxError");
    }

    protected Object exec(AttoTree t) {
        switch (t.getType()) {
        case BLOCK:
            return block(t);
        case STMT:
            return stmt(t);
        case CLASS:
            return class_(t);
        case PARENT_CLASS:
            return parent_class(t);
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
        case TEXT:
            return text(t);
        case VARDEF:
            return vardef(t);
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
        case REVERSE_PIPELINE:
            return reverse_pipeline(t);
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
        case ARGS:
            return args(t);
        case INDEX:
            return index(t);
        case FIELD_ACCESS:
            return field_access(t);
        case NUMBER:
            return number(t);
        case STRING:
            return string(t);
        case BOOLEAN:
            return boolean_(t);
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
        for (int i = 0, len = t.getChildCount(); i < len; i++) {
            result = exec(t.getChild(i));
        }
        return result;
    }

    protected Object stmt(AttoTree t) {
        Assert.treeType(t, STMT);
        Assert.equals(1, t.getChildCount());
        return exec(t.getChild(0));
    }

    protected Object class_(AttoTree t) {
        Assert.treeType(t, CLASS);
        String name = t.getChild(0).getText();
        Obj parent = (Obj) exec(t.getChild(1));
        Obj proto = runtime.newObj();
        for (int i = 2; i < t.getChildCount(); i++) {
            Object[] pair = (Object[]) exec(t.getChild(i));
            proto.put((String) pair[0], (Obj) pair[1]);
        }
        Obj clazz = parent.callMethod("clone", proto);
        clazz.put("class", runtime.newString(name));
        runtime.currentEnv.put(name, clazz);
        return clazz;
    }

    protected Object parent_class(AttoTree t) {
        Assert.treeType(t, PARENT_CLASS);
        if (t.getChildCount() > 0) {
            return exec(t.getChild(0));
        }
        return runtime.objectClass;
    }

    protected Object if_(AttoTree t) {
        Assert.treeType(t, IF);
        AttoTree condition = t.getChild(0);
        AttoTree body = t.getChild(1);
        Object result = null;
        if (exec(condition) == runtime.trueObj) {
            result = exec(body);
        } else {
            for (int i = 2; i < t.getChildCount(); i++) {
                Object[] otherResult = null;
                otherResult = (Object[]) exec(t.getChild(i));
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
        if (exec(condition) == runtime.trueObj) {
            result = new Object[] { exec(body) };
        } else {
            result = new Object[] {};
        }
        return result;
    }

    protected Object else_(AttoTree t) {
        Assert.treeType(t, ELSE);
        AttoTree body = t.getChild(0);
        return new Object[] { exec(body) };
    }

    protected Object while_(AttoTree t) {
        Assert.treeType(t, WHILE);
        AttoTree condition = t.getChild(0);
        AttoTree body = t.getChild(1);
        Object result = null;
        while (exec(condition) == runtime.trueObj) {
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
            Obj index = (Obj) exec(postfix.getChild(1));
            return array.callMethod("set", index, value);
        }
        case FIELD_ACCESS: {
            Obj obj = (Obj) exec(postfix.getChild(0));
            String field = postfix.getChild(1).getText();
            Obj prop = obj.get(field);
            if (runtime.propertyClass.prototype.isPrototypeOf(prop)) {
                Obj setter = prop.get("set");
                if (setter instanceof Fun) {
                    ((Fun) setter).call(obj, new Obj[] { value });
                }
            } else {
                obj.put(field, value);
            }
            return value;
        }
        default:
            throw new RuntimeException("can't assign to " + postfix.getToken());
        }
    }

    protected Object fun(AttoTree t) {
        Assert.treeType(t, FUN);
        String[] params;
        AttoTree body;
        Obj text;
        if (t.getChildCount() == 2) {
            params = new String[] {};
            body = t.getChild(0);
            text = (Obj) exec(t.getChild(1));
        } else if (t.getChildCount() == 3) {
            params = (String[]) exec(t.getChild(0));
            body = t.getChild(1);
            text = (Obj) exec(t.getChild(2));
        } else {
            throw new IllegalStateException();
        }
        return runtime.newSimpleFun(params, body, text);
    }

    protected Object params(AttoTree t) {
        Assert.treeType(t, PARAMS);
        int len = t.getChildCount();
        String[] params = new String[len];
        for (int i = 0; i < len; i++) {
            params[i] = (String) exec(t.getChild(i));
        }
        return params;
    }

    protected Object text(AttoTree t) {
        Assert.treeType(t, TEXT);
        return runtime.newString(t.getText());
    }

    protected Object vardef(AttoTree t) {
        Assert.treeType(t, VARDEF);
        String varname = t.getChild(0).getText();
        if (t.getChildCount() > 1) {
            varname += t.getChild(1).getText();
        }
        return varname;
    }

    protected Object send(AttoTree t) {
        Assert.treeType(t, SEND);
        Obj obj = (Obj) exec(t.getChild(0));
        String name = t.getChild(1).getText();
        Obj[] args = new Obj[t.getChildCount() - 2];
        for (int i = 0; i + 2 < t.getChildCount(); i++) {
            args[i] = (Obj) exec(t.getChild(i + 2));
        }
        return obj.callMethod(name, args);
    }

    protected Object call(AttoTree t) {
        Assert.treeType(t, CALL);
        AttoTree target = t.getChild(0);
        Obj[] args = (Obj[]) exec(t.getChild(1));
        if (target.getType() == FIELD_ACCESS) {
            Obj receiver = (Obj) exec(target.getChild(0));
            String field = target.getChild(1).getText();
            return receiver.callMethod(field, args);
        } else {
            if (target.getType() == AT) {
                Obj receiver = runtime.currentEnv.self;
                String name = target.getChild(0).getText();
                return receiver.callMethod(name, args);
            } else {
                Obj fun = (Obj) exec(target);
                if (fun instanceof Fun) {
                    return ((Fun) fun).call(runtime.nullObj, args);
                }
                throw new RuntimeException("not function: " + target);
            }
        }
    }

    protected Object args(AttoTree t) {
        Assert.treeType(t, ARGS);
        Obj[] args = new Obj[t.getChildCount()];
        for (int i = 0; i < t.getChildCount(); i++) {
            args[i] = (Obj) exec(t.getChild(i));
        }
        return args;
    }

    protected Object index(AttoTree t) {
        Assert.treeType(t, INDEX);
        Obj array = (Obj) exec(t.getChild(0));
        Obj index = (Obj) exec(t.getChild(1));
        return array.callMethod("get", index);
    }

    protected Object field_access(AttoTree t) {
        Assert.treeType(t, FIELD_ACCESS);
        Obj obj = (Obj) exec(t.getChild(0));
        String name = t.getChild(1).getText();
        Obj result = obj.get(name);
        if (runtime.propertyClass.prototype.isPrototypeOf(result)) {
            Fun getter = (Fun) result.get("get");
            return getter.call(obj, new Obj[] {});
        }
        if (result == null) {
            return runtime.nullObj;
        }
        return result;
    }

    protected Object or(AttoTree t) {
        Assert.treeType(t, OR);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object and(AttoTree t) {
        Assert.treeType(t, AND);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object eq(AttoTree t) {
        Assert.treeType(t, EQ);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object ne(AttoTree t) {
        Assert.treeType(t, NE);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object lt(AttoTree t) {
        Assert.treeType(t, LT);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object gt(AttoTree t) {
        Assert.treeType(t, GT);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object le(AttoTree t) {
        Assert.treeType(t, LE);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object ge(AttoTree t) {
        Assert.treeType(t, GE);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object composite(AttoTree t) {
        Assert.treeType(t, COMPOSITE);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object pipeline(AttoTree t) {
        Assert.treeType(t, PIPELINE);
        Obj arg = (Obj) exec(t.getChild(0));
        Obj fun = (Obj) exec(t.getChild(1));
        return fun.callMethod(t.getText(), arg);
    }

    protected Object reverse_pipeline(AttoTree t) {
        Assert.treeType(t, REVERSE_PIPELINE);
        Obj fun = (Obj) exec(t.getChild(0));
        Obj arg = (Obj) exec(t.getChild(1));
        return fun.callMethod(t.getText(), arg);
    }

    protected Object plus(AttoTree t) {
        Assert.treeType(t, PLUS);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object minus(AttoTree t) {
        Assert.treeType(t, MINUS);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object mul(AttoTree t) {
        Assert.treeType(t, MUL);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object div(AttoTree t) {
        Assert.treeType(t, DIV);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object mod(AttoTree t) {
        Assert.treeType(t, MOD);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.callMethod(t.getText(), rhs);
    }

    protected Object not(AttoTree t) {
        Assert.treeType(t, NOT);
        Obj expr = (Obj) exec(t.getChild(0));
        return expr.callMethod(t.getText());
    }

    protected Object unary_minus(AttoTree t) {
        Assert.treeType(t, UNARY_MINUS);
        Obj expr = (Obj) exec(t.getChild(0));
        return expr.callMethod("unary_minus");
    }

    protected Object number(AttoTree t) {
        Assert.treeType(t, NUMBER);
        return runtime.newNumber(new BigDecimal(t.getText()));
    }

    protected Pattern interpolationPattern = Pattern.compile("#\\{(.+?)\\}");

    protected Object string(AttoTree t) {
        Assert.treeType(t, STRING);
        String s = t.getText();
        Matcher m = interpolationPattern
                .matcher(s.substring(1, s.length() - 1));
        StringBuffer buf = new StringBuffer(s.length());
        while (m.find()) {
            String expr = m.group(1);
            Obj result = run(expr, runtime.out);
            String replacement = result.callMethod("toString").asString();
            m.appendReplacement(buf, replacement);
        }
        m.appendTail(buf);
        return runtime.newString(buf.toString());
    }

    protected Object boolean_(AttoTree t) {
        Assert.treeType(t, BOOLEAN);
        if (Boolean.valueOf(t.getText())) {
            return runtime.trueObj;
        } else {
            return runtime.falseObj;
        }
    }

    protected Object null_(AttoTree t) {
        Assert.treeType(t, NULL);
        return runtime.nullObj;
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
        array.put("length", runtime.newNumber(len));
        return array;
    }

    protected Object unknown(AttoTree t) {
        throw new RuntimeException("unknown tree: " + t);
    }

}
