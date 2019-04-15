import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
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
       assertEquals("10 / 0 must be: Sorry Divission By Zero Is Not Possible", 0, calc.division(10, 5));
        try {
            calc.division(10, 0);
        } catch (Exception e) {
            System.out.println("Sorry Divission By Zero Is Not Possible");
        }
    }

    @Test
    public void testSubtractionPositiveValues() {
        assertEquals("100 - 50 must be 50", 50, calc.subtraction(100, 50));  }

    @Test
    public void testSubtractionTwoNegativeValues() {
        assertEquals("10 - 15 must be -5", -5, calc.subtraction(10, -15)); }

    @Test
    public void testSquareRootPositiveValues() {
        assertEquals("Square Root 125 must be 15", 15, calc.squareRoot(125));  }

    @Test
    public void testSquareRootNegativeValues() {
        assertEquals("Square Root -125 must be NaN", 0, calc.squareRoot(-125)); }

    @Test
    public void testPowTwoPositiveValues() {  assertEquals("10 ^2 5 must be 100", 100, calc.powTwo(10));  }

    @Test
    public void testPowTwoNegativeValues() { assertEquals("-20 ^2 must be 100", 400, calc.powTwo(-20)); }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
