package atto;

import java.io.StringWriter;

import junit.framework.TestCase;
import atto.lang.Array;
import atto.lang.Fun;
import atto.lang.Obj;

public class InterpreterTest extends TestCase {

    public void testIF() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(100), i.run("i=3\nif i==3\n  100\n"));
    }

    public void testELIF_first() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i
                .run("i=3\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(300), result);
    }

    public void testELIF_middle() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i
                .run("i=3\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(300), result);
    }

    public void testELIF_last() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i
                .run("i=4\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelif i==4\n  400\n");
        assertEquals(new Integer(400), result);
    }

    public void testELSE() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i
                .run("i=0\nif i==1\n  100\nelif i==2\n  200\nelif i==3\n  300\nelse\n  400\n");
        assertEquals(new Integer(400), result);
    }

    public void testWHILE() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3), i.run("i=0\nwhile i<3\n  i=i+1\n"));
    }

    public void testOBJ() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i.run("{name: 'hoge', age: 10}\n");
        assertTrue(result instanceof Obj);
        Obj obj = (Obj) result;
        assertEquals(2, obj.values.size());
        assertEquals("hoge", obj.values.get("name"));
        assertEquals(new Integer(10), obj.values.get("age"));
    }

    public void testOBJ_assign_and_load() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i.run("o={name: 'hoge', age: 10}\no.name\n");
        assertEquals("hoge", result);
    }

    public void testARRAY() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i.run("[1,2,3]\n");
        assertTrue(result instanceof Array);
        Array array = (Array) result;
        assertEquals(3, array.values.length);
        assertEquals(new Integer(1), array.values[0]);
        assertEquals(new Integer(2), array.values[1]);
        assertEquals(new Integer(3), array.values[2]);
    }

    public void testFUN_expr() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i.run("fun x,y -> x+y\n");
        assertTrue(result instanceof Fun);
    }

    public void testFUN_block() throws Exception {
        Interpreter i = new Interpreter();
        Object result = i.run("fun x,y ->\n  x+y\n");
        assertTrue(result instanceof Fun);
    }

    public void testCALL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3), i.run("f=fun x,y->x+y\nf(1,2)\n"));
        assertEquals(new Integer(3), i.run("(fun x,y->x+y)(1,2)\n"));
    }

    public void testPRINT() throws Exception {
        StringWriter writer = new StringWriter();
        Interpreter i = new Interpreter(writer);
        i.run("a = 100\nprint a\n");
        assertEquals("100" + System.getProperty("line.separator"),
                writer.toString());
    }

    public void testOR() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("1 || 1\n"));
        assertEquals(Boolean.TRUE, i.run("1 || 0\n"));
        assertEquals(Boolean.TRUE, i.run("1 || 0\n"));
        assertEquals(Boolean.FALSE, i.run("0 || 0\n"));
    }

    public void testAND() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("1 && 1\n"));
        assertEquals(Boolean.FALSE, i.run("1 && 0\n"));
    }

    public void testEQ() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("10 == 10\n"));
    }

    public void testNE() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("10 != 20\n"));
    }

    public void testLT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("10 < 20\n"));
        assertEquals(Boolean.FALSE, i.run("10 < 10\n"));
        assertEquals(Boolean.FALSE, i.run("20 < 10\n"));
    }

    public void testGT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.FALSE, i.run("10 > 20\n"));
        assertEquals(Boolean.FALSE, i.run("10 > 10\n"));
        assertEquals(Boolean.TRUE, i.run("20 > 10\n"));
    }

    public void testLE() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("10 <= 20\n"));
        assertEquals(Boolean.TRUE, i.run("10 <= 10\n"));
        assertEquals(Boolean.FALSE, i.run("20 <= 10\n"));
    }

    public void testGE() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.FALSE, i.run("10 >= 20\n"));
        assertEquals(Boolean.TRUE, i.run("10 >= 10\n"));
        assertEquals(Boolean.TRUE, i.run("20 >= 10\n"));
    }

    public void testPLUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(30), i.run("10 + 20\n"));
        assertEquals("ab", i.run("'a' + 'b'\n"));
        assertEquals("10b", i.run("10 + 'b'\n"));
        assertEquals("a10", i.run("'a' + 10\n"));
    }

    public void testMINUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(-10), i.run("10 - 20\n"));
    }

    public void testMUL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(200), i.run("10 * 20\n"));
    }

    public void testDIV() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(5), i.run("100 / 20\n"));
    }

    public void testMOD() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3), i.run("8 % 5\n"));
    }

    public void testNOT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("!false\n"));
        assertEquals(Boolean.TRUE, i.run("!0\n"));
        assertEquals(Boolean.FALSE, i.run("!true\n"));
        assertEquals(Boolean.FALSE, i.run("!1\n"));
    }

    public void testUNARY_MINUS() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(-1), i.run("-1\n"));
    }

    public void testINT() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(new Integer(10), i.run("10\n"));
    }

    public void testSTRING() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals("hoge", i.run("\"hoge\"\n"));
        assertEquals("hoge", i.run("'hoge'\n"));
    }

    public void testBOOL() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("true\n"));
        assertEquals(Boolean.FALSE, i.run("false\n"));
    }

    public void testNULL() throws Exception {
        Interpreter i = new Interpreter();
        assertNull(i.run("null\n"));
    }

    public void testPARENTHESES() throws Exception {
        Interpreter i = new Interpreter();
        assertEquals(Boolean.TRUE, i.run("(true)\n"));
    }

}
