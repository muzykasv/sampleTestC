import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */

public class AddTwoValuesTests {

    private Calculator calc = new Calculator();

    @Before
    public void consolePrint() { System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testMultiplyTwoPositiveValues() {
        assertEquals("10 * 5 must be 50", 50, calc.multiply(10, 5));
    }

    @Test
    public void testMultiplyTwoNegativeValues() {
        assertEquals("-10 * -5 must be 50", 50, calc.multiply(-10, -5)); }

    @Test
    public void testDivisionTwoPositiveValues() {
        assertEquals("10 / 5 must be 2", 2, calc.division(10, 5));
    }

    @Test
    public void testDivisionNegativeValues() {
        String message = "";
        try {
            calc.division(10, 0);
        } catch (Exception e) {
            message = e.getMessage();
        }
        assertEquals("10 / 0 must be: Sorry Divission By Zero Is Not Possible", "/ by zero", message);
    }

    @Test
    public void testSubtractionPositiveValues() {
        assertEquals ("100 - 50 must be 50", 50.0, calc.subtraction(100, 50));  }

    @Test
    public void testSubtractionNegativeValues() {
        assertEquals("10 - 40 must be -30", -30, calc.subtraction(10, -40)); }

    @Test
    public void testSquareRootPositiveValues() {
        assertEquals("Square root 225 must be 15.0", 15.0, calc.squareRoot(225));  }

    @Test
    public void testSquareRootNegativeValues() {

        String message = "";
        try {
            calc.squareRoot(-225);
        } catch (Exception e) {
            message = e.getMessage();
        }
        assertEquals("Square Root -225 must be: NaN", "NaN", message);
    }

    //TODO
    //add new tests for add() method

    @Test
    public void testPowTwoPositiveValues() {  assertEquals("10 ^2 must be 100.0", 100.0, calc.powTwo(10));  }

    @Test
    public void testPowTwoNegativeValues() { assertEquals("-20 ^2 must be 400.0", 400.0, calc.powTwo(-20)); }

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }


}
