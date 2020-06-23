package com.epm.jmp.d2.y2018.m06.t02.test.junit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Multiplication Properties to be tested
 *
 * https://ru.wikipedia.org/wiki/%D0%A3%D0%BC%D0%BD%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5
 *
 */
public class CalculatorTest_multiply {

    private static Calcable calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testMultiplication_Commutativity_Integer() {
        int x = 3;
        int y = 2;
        assertTrue(calc.multiply(x, y) == calc.multiply(y, x));
    }

    @Test
    public void testMultiplication_Commutativity_Double() {
        double x = 3.2;
        double y = 2.3;
        double delta = 0.0000000000000001E+308;
        assertEquals(calc.multiply(x, y), calc.multiply(y, x), delta);
    }

    @Test
    public void testMultiplication_Associativity_Integer() {
        int a = 3;
        int b = 5;
        int c = 7;
        assertTrue(calc.multiply(calc.multiply(a, b), c) == calc.multiply(a, calc.multiply(b, c)));
    }

    @Test
    public void testMultiplication_Associativity_Double() {
        double x = 2.3;
        double y = 3.5;
        double z = 7.11;
        double delta = 0.0000000000000001E+308;
        assertNotEquals(
                calc.multiply(calc.multiply(x, y), z) != calc.multiply(x, calc.multiply(y, z)),
                delta);
    }

    @Test
    public void testMultiplication_Distributivity_Integer() {
        int x = 3;
        int y = 5;
        int z = 7;
        assertTrue(calc.multiply(x, calc.sum(y, z)) == calc.sum(calc.multiply(x, y), calc.multiply(x, z)));
    }

    @Test
    public void testMultiplication_Distributivity_Double() {
        double x = 2.3;
        double y = 5.7;
        double z = 11.13;
        double delta = 0.0000000000000001E+308;
        assertEquals(
                calc.multiply(x, calc.sum(y, z)), calc.sum(calc.multiply(x, y), calc.multiply(x, z)),
                delta);
    }

    @Test
    public void testMultiplication_IdentityElement_Integer() {
        int x = 3;
        assertEquals(x, calc.multiply(x, 1));
    }

    @Test
    public void testMultiplication_IdentityElement_Double() {
        double x = 3.5;
        double delta = 0.0000000000000001E+308;
        assertEquals(x, calc.multiply(x, 1), delta);
    }

    @Test
    public void testMultiplication_PropertyOfZero_Integer() {
        int x = 3;
        assertEquals(0, calc.multiply(x, 0));
    }

    @Test
    public void testMultiplication_PropertyOfZero_Double() {
        double x = 3.5;
        double delta = 0.0000000000000001E+308;
        assertEquals(0, calc.multiply(x, 0), delta);
    }

    @Test
    public void testMultiplication_Double_NegativeInfinity() {
        double delta = 0.0000000000000001E+308;
        double actual = calc.multiply(-1.79769313486231530E+308, 0.00000000000000050E+308);
        assertEquals(Double.NEGATIVE_INFINITY, actual, delta);
    }

    @Test
    public void testMultiplication_Double_PositiveInfinity() {
        double delta = 0.0000000000000001E+308;
        double actual = calc.multiply(1.79769313486231530E+308, 0.00000000000000050E+308);
        assertEquals(Double.POSITIVE_INFINITY, actual, delta);
    }

}
