package com.tinkerpop.gremlin.test.branch;

import com.tinkerpop.blueprints.pgm.Graph;
import com.tinkerpop.blueprints.pgm.Vertex;
import com.tinkerpop.pipes.Pipe;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class LoopStepTest extends TestCase {

    public void testCompliance() {
        assertTrue(true);
    }

    public void test_g_v1_loopXstep_lt_3__outX_propertyXnameX(Pipe<Vertex, String> pipe) {
        List<String> names = new ArrayList<String>();
        while (pipe.hasNext()) {
            names.add(pipe.next());
        }
        assertEquals(names.size(), 2);
        assertTrue(names.contains("ripple"));
        assertTrue(names.contains("lop"));
    }

    public void test_g_V_loopXstep_lt_3__outX_propertyXnameX(Pipe<Graph, String> pipe) {
        List<String> names = new ArrayList<String>();
        while (pipe.hasNext()) {
            names.add(pipe.next());
        }
        assertEquals(names.size(), 2);
        assertTrue(names.contains("ripple"));
        assertTrue(names.contains("lop"));
    }
}