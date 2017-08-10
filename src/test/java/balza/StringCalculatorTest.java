package balza;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
    public void testAdd() throws NegativeNotAllowedException {
        assertEquals(0, app.add(""));
    }

    @Test
    public void testTwoNumbers12() throws NegativeNotAllowedException {
        assertEquals(3, app.add("1,2"));
    }

    @Test
    public void testUnknownAmountOfNumbers() throws NegativeNotAllowedException {
        assertEquals(6, app.add("1,2,3"));
        assertEquals(10, app.add("1,2,3,1,1,1,1"));
    }

    @Test
    public void testNewLines() throws NegativeNotAllowedException {
        assertEquals(6, app.add("1\n2,3"));
    }

    @Test
    public void testSupportDifferentDelimiter() throws NegativeNotAllowedException {
        assertEquals(3, app.add("//;\n1;2"));
    }

    @Test
    public void testNegativeNumber(){
        try {
            app.add("//;\n1;-2");
            fail();
        }catch (NegativeNotAllowedException negativeNotAllowedException){
            assertEquals("Negative not allowed -2", negativeNotAllowedException.getMessage());
        }

        try {
            app.add("//;\n1;-2;-5");
            fail();
        }catch (NegativeNotAllowedException negativeNotAllowedException){
            assertEquals("Negative not allowed -2 -5", negativeNotAllowedException.getMessage());
        }
    }

}
