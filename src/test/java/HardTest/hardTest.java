package HardTest;

import org.halushchak.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class hardTest {


        Calculator calc = new Calculator();

        //TODO (**)
        //add tests for new method - divide by zero case
        @Test
        public void testDivideByZero() {
            double actualDivideResult1 = calc.divideByZero(10, 5);
            assertEquals(2.0, actualDivideResult1,0);


        }
        //TODO (**)
        //add tests for new method - addition with multiple parameters
        @Test
        public void testSumAnyQuantityParameter() {
            int actualSumResult1 = calc.sumAnyQuantityParameter(10, 5, 5);
            assertEquals(15, actualSumResult1);


        }
    }
