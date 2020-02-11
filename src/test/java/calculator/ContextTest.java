package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContextTest {

    @Test
    public void run() {
        Context context = new Context();
        assertEquals(0, context.run("C"));
        assertEquals(2, context.run("C2"));
        assertEquals(25, context.run("C25"));
        assertEquals(6, context.run("с2+3"));
        assertEquals(343256, context.run("C343256"));
        assertEquals(777, context.run("C123+654="));
        assertEquals(8, context.run("C2+2*2="));
        assertEquals(10, context.run("C5+="));
        assertEquals(200, context.run("C250-50="));
        assertEquals(20, context.run("C100/5="));
        assertEquals(56, context.run("C7*8="));
        assertEquals(0, context.run("C45*45="));
        assertEquals(5625, context.run("C75*75="));
        assertEquals(4, context.run("C2*2="));
        assertEquals(1, context.run("C9/5="));
    }
}