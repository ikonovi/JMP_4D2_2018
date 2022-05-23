package com.epm.jmp.d2.y2018.m06.t02.test.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * Subtraction properties to be tested.
 *
 * https://ru.wikipedia.org/wiki/%D0%92%D1%8B%D1%87%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D0%B5
 *
 */
public class CalculatorTest_subtract {

    private static Calcable calc;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testSubtract_Anticommutativity_Integer() {
        int a = 3;
        int b = 2;
        assertTrue(calc.subtract(a, b) == -calc.subtract(b, a));
    }

    @Test
    public void testSubtract_Anticommutativity_Double() {
        double a = 3.2;
        double b = 2.3;
        double delta = 0.0000000000000001E+308;
        assertEquals(calc.subtract(a, b), -calc.subtract(b, a), delta);
    }


    @Test
    public void testSubtract_NonAssociativity_Integer() {
        int a = 3;
        int b = 5;
        int c = 7;
        assertTrue(calc.subtract(calc.subtract(a, b), c) != calc.subtract(a, calc.subtract(b, c)));
    }

    @Test
    public void testSubtract_NonAssociativity_Double() {
        double a = 2.3;
        double b = 3.5;
        double c = 7.11;
        double delta = 0.0000000000000001E+308;
        assertNotEquals(
                calc.subtract(calc.subtract(a, b), c) != calc.subtract(a, calc.subtract(b, c)),
                delta);
    }

    @Test
    public void testSubtract_Zero_Integer() {
        int a = 3;
        assertEquals(a, calc.subtract(a, 0));
    }

    @Test
    public void testSubtract_Zero_Double() {
        double a = 2.3;
        double delta = 0.0000000000000001E+308;
        assertEquals(a, calc.subtract(a, 0), delta);
    }


    @Test
    public void testSubtract_Integer_MAX_VALUE() {
        assertEquals(Integer.MAX_VALUE, calc.subtract(2_147_483_646, -1));
    }

    @Test
    public void testSubtract_Integer_MIN_VALUE() {
        assertEquals(Integer.MIN_VALUE, calc.subtract(-2_147_483_647, 1));
    }

    @Test
    public void testSubtract_Double_PositiveInfinity() {
        double delta = 0.0000000000000001E+308;
        double actual = calc.subtract(1.79769313486231530E+308, -0.00000000000000050E+308);
        assertEquals(Double.POSITIVE_INFINITY, actual, delta);
    }

    @Test
    public void testSubtract_Double_NegativeInfinity() {
        double delta = 0.0000000000000001E+308;
        double actual = calc.subtract(-1.79769313486231530E+308, 0.00000000000000050E+308);
        assertEquals(Double.NEGATIVE_INFINITY, actual, delta);
    }
}
