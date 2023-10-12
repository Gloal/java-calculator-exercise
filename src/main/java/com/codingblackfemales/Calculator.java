package com.codingblackfemales;

public class Calculator {

    public static void main(String[] args) {
        //How to catch an integer overflow
        System.out.println(Calculator.multiply(500000000, 1800));
    }
    public static Integer add(final int firstInput, final int secondInput) {
        return firstInput + secondInput;
    }

    public static Integer subtract(final int firstInput, final int secondInput) {
        return firstInput - secondInput;
    }

    public static Long multiply(final long firstInput, final long secondInput) {
        return firstInput * secondInput;
    }

    public static Double divide(final double firstInput, final double secondInput) {
        return firstInput / secondInput;
    }
}
