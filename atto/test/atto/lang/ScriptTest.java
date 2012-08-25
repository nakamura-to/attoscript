package atto.lang;

import java.io.InputStream;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class ScriptTest extends TestCase {

    private InputStream stream;

    @Override
    protected void tearDown() throws Exception {
        if (stream != null) {
            stream.close();
        }
    }

    public void testWhile() throws Exception {
        InputStream stream = read("while.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(1000), i.run(stream).getObject());
    }

    public void testWhile_then() throws Exception {
        InputStream stream = read("while_then.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(1000), i.run(stream).getObject());
    }

    public void testFactorial() throws Exception {
        InputStream stream = read("factorial.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(3628800), i.run(stream).getObject());
    }

    public void testIf() throws Exception {
        InputStream stream = read("if.atto");
        Interpreter i = new Interpreter();
        assertEquals("foo", i.run(stream).getObject());
    }

    public void testIf_then() throws Exception {
        InputStream stream = read("if_then.atto");
        Interpreter i = new Interpreter();
        assertEquals("foo", i.run(stream).getObject());
    }

    public void testCounter() throws Exception {
        InputStream stream = read("counter.atto");
        Interpreter i = new Interpreter();
        assertEquals("3", i.run(stream).getObject());
    }

    public void testObj() throws Exception {
        InputStream stream = read("obj.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(20), i.run(stream).getObject());
    }

    public void testLineJoining() throws Exception {
        InputStream stream = read("line_joining.atto");
        Interpreter i = new Interpreter();
        assertEquals("4", i.run(stream).getObject());
    }

    public void testAssign() throws Exception {
        InputStream stream = read("assign.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(1), i.run(stream).getObject());
    }

    public void testComposite() throws Exception {
        InputStream stream = read("composite.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(10), i.run(stream).getObject());
    }

    public void testPartialApplication() throws Exception {
        InputStream stream = read("partial_application.atto");
        Interpreter i = new Interpreter();
        assertEquals(new Integer(7), i.run(stream).getObject());
    }

    public void testDotChain() throws Exception {
        InputStream stream = read("dot_chain.atto");
        Interpreter i = new Interpreter();
        assertEquals("hoge", i.run(stream).getObject());
    }

    public void testPipeline() throws Exception {
        InputStream stream = read("pipeline.atto");
        Interpreter i = new Interpreter();
        assertEquals("20", i.run(stream).getObject());
    }

    public void testArrayMap() throws Exception {
        InputStream stream = read("array_map.atto");
        Interpreter i = new Interpreter();
        Obj result = i.run(stream);
        assertEquals(4, result.values.size());
        assertEquals(new Integer(3), result.get("length").object);
        assertEquals(new Integer(10), result.get("0").object);
        assertEquals(new Integer(20), result.get("1").object);
        assertEquals(new Integer(30), result.get("2").object);
    }

    public void testArrayFilter() throws Exception {
        InputStream stream = read("array_filter.atto");
        Interpreter i = new Interpreter();
        Obj result = i.run(stream);
        assertEquals(4, result.values.size());
        assertEquals(new Integer(3), result.get("length").object);
        assertEquals(new Integer(2), result.get("0").object);
        assertEquals(new Integer(4), result.get("1").object);
        assertEquals(new Integer(6), result.get("2").object);
    }

    public void testAt() throws Exception {
        InputStream stream = read("at.atto");
        Interpreter i = new Interpreter();
        assertEquals("hogefoo", i.run(stream).object);
    }

    private InputStream read(String fileName) throws Exception {
        String path = "atto/lang/" + fileName;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream(path);
        if (stream == null) {
            throw new AssertionFailedError("not found: " + path);
        }
        return stream;
    }

}
