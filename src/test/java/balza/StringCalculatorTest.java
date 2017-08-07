package balza;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class StringCalculatorTest {

    private StringCalculator app;

    @Before
    public void before() {
        app = new StringCalculator();
    }

    @Test
    public void testAdd() {
        assertEquals(0, app.add(""));
    }

    @Test
    public void testTwoNumbers12(){
        assertEquals(3, app.add("1,2"));
    }

}
