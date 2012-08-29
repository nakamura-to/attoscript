package atto.lang;

import static atto.AttoParser.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;

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
        case CLASS:
            return class_(t);
        case EXTENDS:
            return extends_(t);
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
        case NUMBER:
            return number(t);
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
        case PROP:
            return prop(t);
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

    protected Object class_(AttoTree t) {
        Assert.treeType(t, CLASS);
        String className = t.getChild(0).getText();
        Obj superclass = (Obj) exec(t.getChild(1));
        Obj prototype = (Obj) exec(t.getChild(2));
        prototype.__proto__ = superclass.get("prototype");
        Obj clazz = runtime.newClass(className, prototype);
        runtime.currentEnv.put(className, clazz);
        return clazz;
    }

    protected Object extends_(AttoTree t) {
        Assert.treeType(t, EXTENDS);
        if (t.getChildCount() > 0) {
            String constructor = t.getChild(0).getText();
            return runtime.currentEnv.get(constructor);
        }
        return runtime.objClass;
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
            return array.send("set", index, value);
        }
        case FIELD_ACCESS: {
            Obj obj = (Obj) exec(postfix.getChild(0));
            String field = postfix.getChild(1).getText();
            Obj prop = obj.get(field);
            if (runtime.propProto.isPrototypeOf(prop)) {
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
            String field = target.getChild(1).getText();
            return receiver.send(field, args);
        } else {
            if (target.getType() == AT) {
                Obj receiver = runtime.currentEnv.self;
                String name = target.getChild(0).getText();
                return receiver.send(name, args);
            } else {
                Obj fun = (Obj) exec(target);
                if (fun instanceof Fun) {
                    return ((Fun) fun).call(runtime.nullObj, args);
                }
                throw new RuntimeException("not function: " + target);
            }
        }
    }

    protected Object index(AttoTree t) {
        Assert.treeType(t, INDEX);
        Obj array = (Obj) exec(t.getChild(0));
        Obj index = (Obj) exec(t.getChild(1));
        return array.send("get", index);
    }

    protected Object field_access(AttoTree t) {
        Assert.treeType(t, FIELD_ACCESS);
        Obj obj = (Obj) exec(t.getChild(0));
        String name = t.getChild(1).getText();
        Obj result = obj.get(name);
        if (runtime.propProto.isPrototypeOf(result)) {
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
        return lhs.send(t.getText(), rhs);
    }

    protected Object and(AttoTree t) {
        Assert.treeType(t, AND);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object eq(AttoTree t) {
        Assert.treeType(t, EQ);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object ne(AttoTree t) {
        Assert.treeType(t, NE);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object lt(AttoTree t) {
        Assert.treeType(t, LT);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object gt(AttoTree t) {
        Assert.treeType(t, GT);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object le(AttoTree t) {
        Assert.treeType(t, LE);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object ge(AttoTree t) {
        Assert.treeType(t, GE);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object composite(AttoTree t) {
        Assert.treeType(t, COMPOSITE);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object pipeline(AttoTree t) {
        Assert.treeType(t, PIPELINE);
        Obj arg = (Obj) exec(t.getChild(0));
        Obj fun = (Obj) exec(t.getChild(1));
        return fun.send(t.getText(), arg);
    }

    protected Object plus(AttoTree t) {
        Assert.treeType(t, PLUS);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object minus(AttoTree t) {
        Assert.treeType(t, MINUS);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object mul(AttoTree t) {
        Assert.treeType(t, MUL);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object div(AttoTree t) {
        Assert.treeType(t, DIV);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object mod(AttoTree t) {
        Assert.treeType(t, MOD);
        Obj lhs = (Obj) exec(t.getChild(0));
        Obj rhs = (Obj) exec(t.getChild(1));
        return lhs.send(t.getText(), rhs);
    }

    protected Object not(AttoTree t) {
        Assert.treeType(t, NOT);
        Obj expr = (Obj) exec(t.getChild(0));
        return expr.send(t.getText());
    }

    protected Object unary_minus(AttoTree t) {
        Assert.treeType(t, UNARY_MINUS);
        Obj expr = (Obj) exec(t.getChild(0));
        return expr.send("unary_minus");
    }

    protected Object number(AttoTree t) {
        Assert.treeType(t, NUMBER);
        return runtime.newNumber(new BigDecimal(t.getText()));
    }

    protected Object string(AttoTree t) {
        Assert.treeType(t, STRING);
        String s = t.getText();
        return runtime.newString(s.substring(1, s.length() - 1));
    }

    protected Object bool(AttoTree t) {
        Assert.treeType(t, BOOL);
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

    protected Object prop(AttoTree t) {
        Assert.treeType(t, PROP);
        Obj obj = (Obj) exec(t.getChild(0));
        return runtime.newProp(obj);
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
