package org.halushchak;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    //TODO add method for subtraction
    public int subtraction(int a, int b) {
        return a - b;
    }

    //TODO add method for multiplication
    public int multiplication(int a, int b) {
        return a * b;
    }

    //TODO add method for division
    public double division(int a, int b) {
        return a / b;
    }

    //TODO add method for square root (use Math class)
    public double getSquareRoot(int a) {
        return Math.sqrt(a);

    }

    //TODO add method for x^2
    public int getSquare(int a) {
        return (int) Math.pow(a, 2);
    }

    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers

    public float getAverageValue3Numbers(int number1, int number2, int number3) {
        return (float) ((number1 + number2 + number3) / 3);
    }

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd

    public boolean checkEven(int number11) {
        return ((number11 % 2) == 0);
    }


    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals

    public int getGreaterNumber(int GreaterNumber1, int GreaterNumber2) {
        int GreaterNumber = 0;
        if (GreaterNumber1 > GreaterNumber2) {
            GreaterNumber = GreaterNumber1;
        } else if (GreaterNumber1 < GreaterNumber2) {
            GreaterNumber = GreaterNumber2;
        }
        return GreaterNumber;
    }


    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter
    public int sumAnyQuantityParameter(int... Param) {
        int sum = 0;
        for (int i = 0; i < Param.length; i++)
            sum += Param[i];
        return sum;
    }


    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;
    public double divideByZero(int numerator, int denominator) {
        if (denominator == 0) {

            return "-100";
        } else return (numerator / denominator);
    }
    
    public int newMetod(int Sum) {
        return Sum;
    }

}
