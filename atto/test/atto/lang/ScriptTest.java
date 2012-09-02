package atto.lang;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class ScriptTest extends TestCase {

    public void testSpike() throws Exception {
        run("spike.atto");
    }

    public void testWhile() throws Exception {
        run("while.atto");
    }

    public void testWhile_then() throws Exception {
        run("while_then.atto");
    }

    public void testFactorial() throws Exception {
        run("factorial.atto");
    }

    public void testIf() throws Exception {
        run("if.atto");
    }

    public void testIf_then() throws Exception {
        run("if_then.atto");
    }

    public void testCounter() throws Exception {
        run("counter.atto");
    }

    public void testObj() throws Exception {
        run("obj.atto");
    }

    public void testObjBlock() throws Exception {
        run("obj_block.atto");
    }

    public void testLineJoining() throws Exception {
        run("line_joining.atto");
    }

    public void testAssign() throws Exception {
        run("assign.atto");
    }

    public void testComposite() throws Exception {
        run("composite.atto");
    }

    public void testPartialApplication() throws Exception {
        run("partial_application.atto");
    }

    public void testDotChain() throws Exception {
        run("dot_chain.atto");
    }

    public void testPipeline() throws Exception {
        run("pipeline.atto");
    }

    public void testArrayMap() throws Exception {
        run("array_map.atto");
    }

    public void testArrayFilter() throws Exception {
        run("array_filter.atto");
    }

    public void testArrayEach() throws Exception {
        run("array_each.atto");
    }

    public void testAt() throws Exception {
        run("at.atto");
    }

    public void testClone() throws Exception {
        run("clone.atto");
    }

    public void testClass() throws Exception {
        run("class.atto");
    }

    public void testComment() throws Exception {
        run("comment.atto");
    }

    public void testTime() throws Exception {
        run("time.atto");
    }

    public void testString() throws Exception {
        run("string.atto");
    }

    private void run(String fileName) throws Exception {
        String path = "atto/lang/" + fileName;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream(path);
        if (stream == null) {
            throw new AssertionFailedError("not found: " + path);
        }
        try {
            Interpreter i = new Interpreter();
            i.run(stream);
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
