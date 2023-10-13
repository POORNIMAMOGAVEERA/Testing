package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddition(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2,6);
        assertEquals(8,result);
    }


    @ParameterizedTest
    @CsvSource({"2, 3, 5", "5, 7, 12", "10, 0, 10"})
    void testAddition(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    void testAssertions() {
        String nullString = null;
        String notNullString = "Hello, JUnit 5";

        assertNull(nullString);
        assertNotNull(notNullString);

        int[] expectedArray = {1, 2, 3};
        int[] resultArray = {1, 2, 3};

        assertArrayEquals(expectedArray, resultArray);

        assertTrue(5 > 2);
        assertFalse(1 == 0);

        assertNotSame(nullString, notNullString);
        assertSame(notNullString, notNullString);
    }

    @Nested
    class AdditionTests {
        @Test
        void testPositiveNumbers() {
            assertEquals(5, Math.addExact(2,3));
        }

        @Test
        void testNegativeNumbers() {
            assertEquals(-1, Math.addExact(-3, 2));
        }
    }

    @Nested
    class SubtractionTests {
        @Test
        void testPositiveNumbers() {
            assertEquals(2, Math.subtractExact(5,3));
        }

        @Test
        void testNegativeNumbers() {
            assertEquals(-5, Math.subtractExact(-2, 3));
        }
    }

    @Test
    public void testDivideByZero(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class,()-> {
            calculator.divide(7,0);
        });
    }

    @Test
    public void testDivideByNonZero(){
        Calculator calculator = new Calculator();
        assertEquals(8,calculator.divide(16,2));
    }
}