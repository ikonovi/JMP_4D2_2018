package com.epm.jmp.d2.y2018.m06.t02.test.junit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Power Properties to be tested
 *
 * https://ru.wikipedia.org/wiki/%D0%92%D0%BE%D0%B7%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5_%D0%B2_%D1%81%D1%82%D0%B5%D0%BF%D0%B5%D0%BD%D1%8C
 *
 */
public class CalculatorTest_power {

    private static Calcable calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testPower_Prop1() {
        int a = 3;
        int b = 5;
        int n = 7;
        assertTrue(calc.power(calc.multiply(a, b), n) == calc.multiply(calc.power(a, n),
                calc.power(b, n)));
    }

    @Test
    public void testPower_Prop2() {
        int a = 3;
        int b = 5;
        int n = 7;
        double delta = 0.001;
        assertEquals(calc.power(calc.divide(a, b), n),
                calc.divide(calc.power(a, n), calc.power(b, n)), delta);
    }

    @Test
    public void testPower_Prop3() {
        int a = 3;
        int n = 7;
        int m = 11;
        double delta = 0.001;
        assertEquals(calc.multiply(calc.power(a, n), calc.power(a, m)),
                calc.power(a, calc.sum(n, m)), delta);
    }

    @Test
    public void testPower_Prop4() {
        int a = 3;
        int n = 7;
        int m = 11;
        double delta = 0.001;
        assertEquals(calc.divide(calc.power(a, n), calc.power(a, m)),
                calc.power(a, calc.subtract(n, m)), delta);
    }

    @Test
    public void testPower_Prop5() {
        int a = 3;
        int n = 7;
        int m = 11;
        double delta = 0.001;
        assertEquals(calc.power(calc.power(a, n), m), calc.power(a, calc.multiply(n, m)), delta);
    }

    @Test
    public void testPower_NonAssociativity() {
        int a = 3;
        int n = 7;
        int m = 11;
        double delta = 0.001;
        assertNotEquals(calc.power(calc.power(a, n), m), calc.power(a, calc.power(n, m)), delta);
    }

    @Test
    public void testPower_NonCommutativity() {
        int n = 7;
        int m = 11;
        double delta = 0.001;
        assertNotEquals(calc.power(n, m), calc.power(m, n), delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPower_ZeroRaisedToPower() {
        int a = 0;
        int n = 7;
        calc.power(a, n);
    }

    @Test
    public void testPower_PowerOfZero() {
        int a = 7;
        int n = 0;
        double delta = 0.001;
        assertEquals(1, calc.power(a, n), delta);
    }
}
