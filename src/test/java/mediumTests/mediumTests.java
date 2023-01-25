package mediumTests;

import org.halushchak.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class mediumTests {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - average value
    @Test

    public void testAverageValue3Numbers() {
        double actualResultAverageValue1 = calc.getAverageValue3Numbers(10, 20, 30);
        assertEquals(20, actualResultAverageValue1,0);


    }

    //TODO (**)
    //add tests for new method - even or odd
    public void testCheckEven() {
        boolean actualResultEven1 = calc.checkEven(10);
        assertEquals(true, actualResultEven1);

        boolean actualResultEven2 = calc.checkEven(5);
        assertEquals(false, actualResultEven2);

        boolean actualResultEven3 = calc.checkEven(4);
        assertEquals(false, actualResultEven3);
    }
    //TODO (**)
    //add tests for new method - biggest value
    public void testGetGreaterNumber() {
        int actualResultGreaterNumber1 = calc.getGreaterNumber(10, 5);
        assertEquals(10, actualResultGreaterNumber1);

        int actualResultGreaterNumber2 = calc.getGreaterNumber(2, 5);
        assertEquals(5, actualResultGreaterNumber2);

        int actualResultGreaterNumber3 = calc.getGreaterNumber(4, 4);
        assertEquals(5, actualResultGreaterNumber3);
    }

}
