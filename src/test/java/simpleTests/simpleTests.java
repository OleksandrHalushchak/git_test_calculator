package simpleTests;

import org.halushchak.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class simpleTests {

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValues() {
        int actualResult1 = calc.add(10, 5);
        assertEquals(20, actualResult1);


    //    int actualResult4 = calc.add(3, -13);
     //   assertEquals(-10, actualResult3);
        // !!!!!!!!!!!!!Не зрозуміло чому падає тест!!!!!!!!!
    }

    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)

    @Test
    public void testSubtractionTwoPositiveValues() {
        int actualResult01 = calc.subtraction (10, 5);
        assertEquals(5, actualResult01);

        int actualResult02 = calc.subtraction (5, 10);
        assertEquals(-5, actualResult02);

        int actualResult03 = calc.subtraction (0, 0);
        assertEquals(0, actualResult03);
    }
    @Test
    // !!!!!!!!!!!!!!! НЕ ПРАЦЮЄ!!!!!!!!!!!!!
    public void testMultiplicationTwoPositiveValues() {
        int actualResult11 = calc.multiplication (5, 4);
        assertEquals(2555550, actualResult11);

    }
    @Test
    // !!!!!!!!!!!!!ЯК ОТРИМАТИ ДРОБНУ ВІДПОВІДЬ!!!!!!!!!
    public void testDivisionTwoPositiveValues() {
        double actualResult21 = calc.division (8, 5);
        assertEquals(2, actualResult21, 0);

        double actualResult22 = calc.division (10, 5);
        assertEquals(2, actualResult22, 0);

        double actualResult23 = calc.division (25, 5);
        assertEquals(5, actualResult23, 0);
    }
    @Test
          public void testSquareRootPositiveValues() {
        double actualResult31 = calc.getSquareRoot (2);
        assertEquals( 4, actualResult31);

        double actualResult32 = calc.getSquareRoot (5);
        assertEquals(32, actualResult32);

        double actualResult33 = calc.getSquareRoot (25);
        assertEquals(100, actualResult33);
    }
    @Test
     public void testSquarePositiveValues() {
        int actualResult5 = calc.getSquare (5);
        assertEquals(0, actualResult5);

        int actualResult6 = calc.getSquare (10);
        assertEquals(0, actualResult6);

        int actualResult7 = calc.getSquare (2);
        assertEquals(0, actualResult7);
    }
}
