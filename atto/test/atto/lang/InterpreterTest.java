package atto.lang;

import java.io.PrintWriter;
import java.io.StringWriter;

import junit.framework.TestCase;

public class InterpreterTest extends TestCase {

    public void testIF() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("i=3\nif i==3\n  100\n");
        assertEquals(new Integer(100), result.getObject());
    }

    public void testELIF_first() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i
                .run("i=3\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(300), result.getObject());
    }

    public void testELIF_middle() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i
                .run("i=3\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(300), result.getObject());
    }

    public void testELIF_last() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i
                .run("i=4\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(400), result.getObject());
    }

    public void testELSE() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i
                .run("i=0\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelse\n  400\n");
        assertEquals(new Integer(400), result.getObject());
    }

    public void testWHILE() throws Exception {
        Interpreter i = new Interpreter();
        Obj result = i.run("i=0\nwhile i<3\n  i=i+1\n");
        assertEquals(new Integer(3), result.getObject());
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
        assertEquals("hoge", result.getObject());
    }

    public void testARRAY_get() throws Exception {
        Interpreter i = new Interpreter();
        i.run("a=[1,2,3]\n");
        assertEquals(new Integer(1), i.run("a[0]\n").getObject());
        assertEquals(new Integer(2), i.run("a[1]\n").getObject());
        assertEquals(new Integer(3), i.run("a[2]\n").getObject());
    }

    public void testARRAY_set() throws Exception {
        Interpreter i = new Interpreter();
        i.run("a=[0,0,0]\na[0]=1\na[1]=2\na[2]=3\n");
        assertEquals(new Integer(1), i.run("a[0]\n").getObject());
        assertEquals(new Integer(2), i.run("a[1]\n").getObject());
        assertEquals(new Integer(3), i.run("a[2]\n").getObject());
    }

    public void testARRAY_push() throws Exception {
        Interpreter i = new Interpreter();
        i.run("a=[]\na.push(1)\na.push(2)\na.push(3)\n");
        assertEquals(new Integer(1), i.run("a[0]\n").getObject());
        assertEquals(new Integer(2), i.run("a[1]\n").getObject());
        assertEquals(new Integer(3), i.run("a[2]\n").getObject());
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

    public void testCALL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3), i.run("f=x,y->x+y\nf(1,2)\n").getObject());
        assertEquals(new Integer(3), i.run("(x,y->x+y)(1,2)\n").getObject());
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
        assertEquals(Boolean.TRUE, i.run("1 || 1\n").getObject());
        assertEquals(Boolean.TRUE, i.run("1 || 0\n").getObject());
        assertEquals(Boolean.TRUE, i.run("1 || 0\n").getObject());
        assertEquals(Boolean.FALSE, i.run("0 || 0\n").getObject());
    }

    public void testAND() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("1 && 1\n").getObject());
        assertEquals(Boolean.FALSE, i.run("1 && 0\n").getObject());
    }

    public void testEQ() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("10 == 10\n").getObject());
    }

    public void testNE() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("10 != 20\n").getObject());
    }

    public void testLT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("10 < 20\n").getObject());
        assertEquals(Boolean.FALSE, i.run("10 < 10\n").getObject());
        assertEquals(Boolean.FALSE, i.run("20 < 10\n").getObject());
    }

    public void testGT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.FALSE, i.run("10 > 20\n").getObject());
        assertEquals(Boolean.FALSE, i.run("10 > 10\n").getObject());
        assertEquals(Boolean.TRUE, i.run("20 > 10\n").getObject());
    }

    public void testLE() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("10 <= 20\n").getObject());
        assertEquals(Boolean.TRUE, i.run("10 <= 10\n").getObject());
        assertEquals(Boolean.FALSE, i.run("20 <= 10\n").getObject());
    }

    public void testGE() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.FALSE, i.run("10 >= 20\n").getObject());
        assertEquals(Boolean.TRUE, i.run("10 >= 10\n").getObject());
        assertEquals(Boolean.TRUE, i.run("20 >= 10\n").getObject());
    }

    public void testPLUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(30), i.run("10 + 20\n").getObject());
        assertEquals("ab", i.run("'a' + 'b'\n").getObject());
        assertEquals("10b", i.run("10 + 'b'\n").getObject());
        assertEquals("a10", i.run("'a' + 10\n").getObject());
    }

    public void testMINUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(-10), i.run("10 - 20\n").getObject());
    }

    public void testMUL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(200), i.run("10 * 20\n").getObject());
    }

    public void testDIV() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(5), i.run("100 / 20\n").getObject());
    }

    public void testMOD() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3), i.run("8 % 5\n").getObject());
    }

    public void testNOT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("!false\n").getObject());
        assertEquals(Boolean.TRUE, i.run("!0\n").getObject());
        assertEquals(Boolean.FALSE, i.run("!true\n").getObject());
        assertEquals(Boolean.FALSE, i.run("!1\n").getObject());
    }

    public void testUNARY_MINUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(-1), i.run("-1\n").getObject());
    }

    public void testINT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(10), i.run("10\n").getObject());
    }

    public void testSTRING() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals("hoge", i.run("\"hoge\"\n").getObject());
        assertEquals("hoge", i.run("'hoge'\n").getObject());
    }

    public void testBOOL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("true\n").getObject());
        assertEquals(Boolean.FALSE, i.run("false\n").getObject());
    }

    public void testNULL() throws Exception {
        Interpreter i = new Interpreter();
        assertTrue(i.run("null\n").isNull());
    }

    public void testPARENTHESES() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("(true)\n").getObject());
    }

}
