package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("add two big numbers")
    public void testAdditionBigNumbers() {
        final Integer sum = Calculator.add(2000000000, 800000000);

        assertEquals(10000000000, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("Multiply two numbers")
    public void testMultiply(){
        final Long product = Calculator.multiply(6L,2L);

        assertEquals(12, product);
    }

    @Test
    @DisplayName("Multiply by Zero")
    public void testMultiplyByZero(){
        final Long product = Calculator.multiply(7,0);

        assertEquals(0, product);
    }

    @Test
    @DisplayName("Multiply very big number")
    public void testMultiplyTooLarge(){
        final Long product = Calculator.multiply(500000000, 18);

        assertEquals(9000000000L, product);
    }

    @Test
    @DisplayName("Divide two integer numbers and return double")
    public void  testDivision(){
        final Double quotient = Calculator.divide(55, 100);

        assertEquals(0.55, quotient);
    }

    @Test
    @DisplayName("Divide two integers return zero")
    public void testDivisionByZero(){
        final Double quotient = Calculator.divide(0, 100);

        assertEquals(0, quotient);
    }

    @Test
    @DisplayName("Divide two integers return infinity")
    public void testDivisionZero(){
        final Double quotient = Calculator.divide(100, 0);

        assertEquals(Double.POSITIVE_INFINITY, quotient);
    }

}
