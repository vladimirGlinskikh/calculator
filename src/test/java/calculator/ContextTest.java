package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContextTest {

    @Test
    public void run() {
        Context context = new Context();
        assertEquals(0, context.run("c"));
        assertEquals(2, context.run("c2"));
        assertEquals(25, context.run("c25"));
        assertEquals(5, context.run("c2+3="));
        assertEquals(343256, context.run("c343256"));
        assertEquals(777, context.run("c123+654="));
        assertEquals(8, context.run("c2+2*2="));
        assertEquals(10, context.run("c5+="));
        assertEquals(200, context.run("c250-50="));
        assertEquals(20, context.run("c100/5="));
        assertEquals(56, context.run("c7*8="));
        assertEquals(2025, context.run("c45*45="));
        assertEquals(5625, context.run("c75*75="));
        assertEquals(4, context.run("c2*2="));
        assertEquals(1, context.run("c9/5="));
    }
}