package atto.lang;

import java.io.PrintWriter;
import java.io.StringWriter;

import junit.framework.TestCase;

public class InterpreterTest extends TestCase {

    public void testIF() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("i=3\nif i==3\n  100\n");
        assertEquals(new Integer(100), result.asObject());
    }

    public void testELIF_first() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i
                .run("i=3\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(300), result.asObject());
    }

    public void testELIF_middle() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i
                .run("i=3\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(300), result.asObject());
    }

    public void testELIF_last() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i
                .run("i=4\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(400), result.asObject());
    }

    public void testELSE() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i
                .run("i=0\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelse\n  400\n");
        assertEquals(new Integer(400), result.asObject());
    }

    public void testWHILE() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("i=0\nwhile i<3\n  i=i+1\n");
        assertEquals(new Integer(3), result.asObject());
    }

    public void testOBJ() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("{name: 'hoge', age: 10}\n");
        assertEquals(2, result.values.size());
        assertEquals("hoge", result.getString("name"));
        assertEquals(10, result.getInt("age"));
    }

    public void testOBJ_assign_and_load() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("o={name: 'hoge', age: 10}\no.name\n");
        assertEquals("hoge", result.asObject());
    }

    public void testOBJ_EQ() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("o = {name: 'hoge', age: 10}\no == o\n");
        assertTrue(result.asBoolean());
    }

    public void testOBJ_NE() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("x = {}\ny = {}\nx != y\n");
        assertTrue(result.asBoolean());
    }

    public void testOBJ_getter() throws Exception {
        Interpreter i = new Interpreter();
        i.run("x={fname:'hoge',lname:'foo',fullname:{{get:->@fname+@lname}}}\n");
        Obj result = i.run("x.fullname");
        assertEquals("hogefoo", result.asString());
    }

    public void testOBJ_setter() throws Exception {
        Interpreter i = new Interpreter();
        i.run("x={name:'hoge',age:{{set:y->@name+=y}}}\n");
        Obj result = i.run("x.age=10\nx.name\n");
        assertEquals("hoge10", result.asString());
    }

    public void testARRAY_get() throws Exception {
        Interpreter i = new Interpreter();
        i.run("a=[1,2,3]\n");
        assertEquals(new Integer(1), i.run("a[0]\n").asObject());
        assertEquals(new Integer(2), i.run("a[1]\n").asObject());
        assertEquals(new Integer(3), i.run("a[2]\n").asObject());
    }

    public void testARRAY_set() throws Exception {
        Interpreter i = new Interpreter();
        i.run("a=[0,0,0]\na[0]=1\na[1]=2\na[2]=3\n");
        assertEquals(new Integer(1), i.run("a[0]\n").asObject());
        assertEquals(new Integer(2), i.run("a[1]\n").asObject());
        assertEquals(new Integer(3), i.run("a[2]\n").asObject());
    }

    public void testARRAY_push() throws Exception {
        Interpreter i = new Interpreter();
        i.run("a=[]\na.push(1)\na.push(2)\na.push(3)\n");
        assertEquals(new Integer(1), i.run("a[0]\n").asObject());
        assertEquals(new Integer(2), i.run("a[1]\n").asObject());
        assertEquals(new Integer(3), i.run("a[2]\n").asObject());
    }

    public void testARROW_expr() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i.run("x,y -> x+y\n");
        assertTrue(result instanceof Fun);
    }

    public void testARROW_block() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i.run("x,y ->\n  x+y\n");
        assertTrue(result instanceof Fun);
    }

    public void testARRAY_EQ() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("a=[1,2,3]\nb=[1,2,3]\na==b\n");
        assertTrue(result.asBoolean());
        result = i.run("a=[1,2,3]\nb=[1,2]\na==b\n");
        assertFalse(result.asBoolean());
        result = i.run("a=[1,2,3]\nb='1'\na==b\n");
        assertFalse(result.asBoolean());
        result = i.run("a=[1,2,3]\nb=[1,2,4]\na==b\n");
        assertFalse(result.asBoolean());
    }

    public void testARRAY_NQ() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("a=[1,2,3]\nb=[1,2,3]\na!=b\n");
        assertFalse(result.asBoolean());
        result = i.run("a=[1,2,3]\nb=[1,2]\na!=b\n");
        assertTrue(result.asBoolean());
        result = i.run("a=[1,2,3]\nb='1'\na!=b\n");
        assertTrue(result.asBoolean());
        result = i.run("a=[1,2,3]\nb=[1,2,4]\na!=b\n");
        assertTrue(result.asBoolean());
    }

    public void testCALL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3), i.run("f=x,y->x+y\nf(1,2)\n").asObject());
        assertEquals(new Integer(3), i.run("(x,y->x+y)(1,2)\n").asObject());
    }

    public void testPRINT() throws Exception {
        StringWriter writer = new StringWriter();
        Interpreter i = new Interpreter();
        i.run("a = 100\nprint(a)\n", new PrintWriter(writer));
        assertEquals("100" + System.getProperty("line.separator"),
                writer.toString());
    }

    public void testOR() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("1 || 1\n").asObject());
        assertEquals(Boolean.TRUE, i.run("1 || 0\n").asObject());
        assertEquals(Boolean.TRUE, i.run("1 || 0\n").asObject());
        assertEquals(Boolean.FALSE, i.run("0 || 0\n").asObject());
    }

    public void testAND() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("1 && 1\n").asObject());
        assertEquals(Boolean.FALSE, i.run("1 && 0\n").asObject());
    }

    public void testNOT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("!false\n").asObject());
        assertEquals(Boolean.TRUE, i.run("!0\n").asObject());
        assertEquals(Boolean.FALSE, i.run("!true\n").asObject());
        assertEquals(Boolean.FALSE, i.run("!1\n").asObject());
    }

    public void testUNARY_MINUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(-1), i.run("-1\n").asObject());
    }

    public void testINT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(10), i.run("10\n").asObject());
    }

    public void testINT_EQ() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("10 == 10\n").asBoolean());
        assertTrue(i.run("'abc' == 'abc'\n").asBoolean());
    }

    public void testINT_NE() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("10 != 20\n").asBoolean());
    }

    public void testINT_LT() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("10 < 20\n").asBoolean());
        assertFalse(i.run("10 < 10\n").asBoolean());
        assertFalse(i.run("20 < 10\n").asBoolean());
    }

    public void testINT_GT() throws Exception {
        Interpreter i = new Interpreter();
        assertFalse(i.run("10 > 20\n").asBoolean());
        assertFalse(i.run("10 > 10\n").asBoolean());
        assertTrue(i.run("20 > 10\n").asBoolean());
    }

    public void testINT_LE() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("10 <= 20\n").asBoolean());
        assertTrue(i.run("10 <= 10\n").asBoolean());
        assertFalse(i.run("20 <= 10\n").asBoolean());
    }

    public void testINT_GE() throws Exception {
        Interpreter i = new Interpreter();
        assertFalse(i.run("10 >= 20\n").asBoolean());
        assertTrue(i.run("10 >= 10\n").asBoolean());
        assertTrue(i.run("20 >= 10\n").asBoolean());
    }

    public void testINT_PLUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(30, i.run("10 + 20\n").asInt());
    }

    public void testINT_MINUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(-10, i.run("10 - 20\n").asInt());
    }

    public void testINT_MUL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(200, i.run("10 * 20\n").asInt());
    }

    public void testINT_DIV() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(5, i.run("100 / 20\n").asInt());
    }

    public void testINT_MOD() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(3, i.run("8 % 5\n").asInt());
    }

    public void testINT_PLUS_ASSIGN() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(3, i.run("a=1\na+=2\na\n").asInt());
    }

    public void testINT_MINUS_ASSIGN() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(-1, i.run("a=1\na-=2\na\n").asInt());
    }

    public void testINT_MUL_ASSIGN() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(6, i.run("a=2\na*=3\na\n").asInt());
    }

    public void testINT_DIV_ASSIGN() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(5, i.run("a=10\na/=2\na\n").asInt());
    }

    public void testINT_MOD_ASSIGN() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(3, i.run("a=8\na%=5\na\n").asInt());
    }

    public void testSTRING() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals("hoge", i.run("\"hoge\"\n").asObject());
        assertEquals("hoge", i.run("'hoge'\n").asObject());
    }

    public void testSTRING_EQ() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("'abc' == 'abc'\n").asBoolean());
    }

    public void testSTRING_NE() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("'abc' != 'def'\n").asBoolean());
    }

    public void testSTRING_LT() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("'a' < 'b'\n").asBoolean());
        assertFalse(i.run("'a' < 'a'\n").asBoolean());
        assertFalse(i.run("'b' < 'a'\n").asBoolean());
    }

    public void testSTRING_GT() throws Exception {
        Interpreter i = new Interpreter();
        assertFalse(i.run("'a' > 'b'\n").asBoolean());
        assertFalse(i.run("'a' > 'a'\n").asBoolean());
        assertTrue(i.run("'b' > 'a'\n").asBoolean());
    }

    public void testSTRING_LE() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("'a' <= 'b'\n").asBoolean());
        assertTrue(i.run("'a' <= 'a'\n").asBoolean());
        assertFalse(i.run("'b' <= 'a'\n").asBoolean());
    }

    public void testSTRING_GE() throws Exception {
        Interpreter i = new Interpreter();
        assertFalse(i.run("'a' >= 'b'\n").asBoolean());
        assertTrue(i.run("'a' >= 'a'\n").asBoolean());
        assertTrue(i.run("'b' >= 'a'\n").asBoolean());
    }

    public void testSTRING_PLUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals("ab", i.run("'a' + 'b'\n").asString());
        assertEquals("10b", i.run("10 + 'b'\n").asString());
        assertEquals("a10", i.run("'a' + 10\n").asString());
    }

    public void testBOOL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("true\n").asObject());
        assertEquals(Boolean.FALSE, i.run("false\n").asObject());
    }

    public void testNULL() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("null\n").isNull());
    }

    public void testPARENTHESES() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("(true)\n").asObject());
    }

}
