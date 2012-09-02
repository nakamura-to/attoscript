package atto.lang;

import java.io.PrintWriter;
import java.math.BigDecimal;

import atto.AttoTree;

public class Runtime {

    protected final Interpreter interpreter;
    protected final PrintWriter out;

    protected Env currentEnv;

    protected Obj objectProto;
    protected Obj functionProto;

    protected Obj nullObj;
    protected Obj trueObj;
    protected Obj falseObj;

    protected ClassFun objectClass;
    protected ClassFun booleanClass;
    protected ClassFun functionClass;
    protected ClassFun arrayClass;
    protected ClassFun numberClass;
    protected ClassFun stringClass;
    protected ClassFun propertyClass;

    public Runtime(Interpreter interpreter, PrintWriter out) {
        this.interpreter = interpreter;
        this.out = out;
    }

    public void init() {
        currentEnv = new Env(this);

        objectProto = new Obj(this, null);
        functionProto = new Obj(this, objectProto);

        objectClass = buildObjectClass();
        functionClass = buildFunctionClass();
        numberClass = buildNumberClass();
        stringClass = buildStringClass();
        arrayClass = buildArrayClass();
        booleanClass = buildBooleanClass();
        propertyClass = buildPropertyClass();

        nullObj = new Obj(this, objectProto);
        nullObj.addMethod("toString", new Method() {
            @Override
            public Obj call(Obj receiver, Obj[] args) {
                return nullObj;
            }
        });
        trueObj = booleanClass.call(nullObj, new Obj[] {});
        trueObj.putJavaObject("__value__", Boolean.TRUE);
        falseObj = booleanClass.call(nullObj, new Obj[] {});
        falseObj.putJavaObject("__value__", Boolean.FALSE);

        // built-in constructors
        currentEnv.put("Object", objectClass);
        currentEnv.put("Function", functionClass);
        currentEnv.put("Array", arrayClass);
        currentEnv.put("Boolean", booleanClass);
        currentEnv.put("Number", numberClass);
        currentEnv.put("String", stringClass);
        currentEnv.put("Property", propertyClass);

        // built-in function
        currentEnv.put("print", new BuiltinFun.PrintFun(this, out));
        currentEnv.put("assert", new BuiltinFun.AssertFun(this, out));
        currentEnv.put("time", new BuiltinFun.TimeFun(this));
    }

    protected ClassFun buildObjectClass() {
        return new ObjectClassBuilder(this).build();
    }

    protected ClassFun buildFunctionClass() {
        return new FunctionClassBuilder(this).build();
    }

    protected ClassFun buildArrayClass() {
        return new ArrayClassBuilder(this).build();
    }

    protected ClassFun buildBooleanClass() {
        return new BooleanClassBuilder(this).build();
    }

    protected ClassFun buildNumberClass() {
        return new NumberClassBuilder(this).build();
    }

    protected ClassFun buildStringClass() {
        return new StringClassBuilder(this).build();
    }

    protected ClassFun buildPropertyClass() {
        return new PropertyClassBuilder(this).build();
    }

    public Obj newObj() {
        return objectClass.call(nullObj, new Obj[] {});
    }

    public Obj newSimpleFun(String[] params, AttoTree body) {
        return new SimpleFun(this, currentEnv, params, body);
    }

    public Obj newCompositeFun(Fun first, Fun second) {
        return new CompositeFun(this, currentEnv, first, second);
    }

    public Obj newArray() {
        return arrayClass.call(nullObj, new Obj[] {});
    }

    public Obj newString(String s) {
        Obj obj = stringClass.call(nullObj, new Obj[] {});
        obj.putJavaObject("__value__", s == null ? "" : s);
        obj.put("length", newNumber(s.length()));
        return obj;
    }

    public Obj newNumber(BigDecimal d) {
        Obj obj = numberClass.call(nullObj, new Obj[] {});
        obj.putJavaObject("__value__", d == null ? BigDecimal.ZERO : d);
        return obj;
    }

    public Obj newNumber(int i) {
        return newNumber(new BigDecimal(i));
    }

    public Obj newNumber(long l) {
        return newNumber(new BigDecimal(l));
    }

    public Obj exec(AttoTree tree) {
        return (Obj) interpreter.exec(tree);
    }

}
