package com.epm.jmp.d2.y2018.m06.t02.test.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Addition Properties to be tested
 *
 * https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5
 *
 */
public class CalculatorTest_sum {

    private static Calcable calc;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testSum_Zero_Integer() {
        int a = 3;
        assertEquals(a, calc.sum(a, 0));
    }

    @Test
    public void testSum_Zero_Double() {
        double a = 2.3;
        double delta = 0.0000000000000001E+308;
        assertEquals(a, calc.sum(a, 0), delta);
    }

    @Test
    public void testSubtract_Associativity_Integer() {
        int a = 3;
        int b = 5;
        int c = 7;
        assertTrue(calc.sum(calc.sum(a, b), c) == calc.sum(a, calc.sum(b, c)));
    }

    @Test
    public void testSubtract_Associativity_Double() {
        double a = 2.3;
        double b = 3.5;
        double c = 7.11;
        double delta = 0.0000000000000001E+308;
        assertNotEquals(
                calc.subtract(calc.subtract(a, b), c) != calc.subtract(a, calc.subtract(b, c)),
                delta);
    }

    @Test
    public void testSubtract_Commutativity_Integer() {
        int a = 3;
        int b = 2;
        assertTrue(calc.sum(a, b) == calc.sum(b, a));
    }

    @Test
    public void testSubtract_Commutativity_Double() {
        double a = 3.2;
        double b = 2.3;
        double delta = 0.0000000000000001E+308;
        assertEquals(calc.sum(a, b), calc.sum(b, a), delta);
    }



    @Test
    public void testSum_Integer_MAX_VALUE() {
        assertEquals(Integer.MAX_VALUE, calc.sum(2_147_483_646, 1));
    }

    @Test
    public void testSum_Integer_MIN_VALUE() {
        assertEquals(Integer.MIN_VALUE, calc.sum(-2_147_483_647, -1));
    }

    @Test
    public void testSum_Double_NegativeInfinity() {
        double delta = 0.0000000000000001E+308;
        double actual = calc.sum(-1.79769313486231530E+308, -0.00000000000000050E+308);
        assertEquals(Double.NEGATIVE_INFINITY, actual, delta);
    }

    @Test
    public void testSum_Double_PositiveInfinity() {
        double delta = 0.0000000000000001E+308;
        double actual = calc.sum(1.79769313486231530E+308, 0.00000000000000050E+308);
        assertEquals(Double.POSITIVE_INFINITY, actual, delta);
    }

}
