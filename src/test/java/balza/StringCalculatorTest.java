package balza;

import org.junit.Before;

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


    public void testAdd() {
        assertEquals(0, app.add(""));
    }
}
