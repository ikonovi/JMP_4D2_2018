package com.epm.jmp.d2.y2018.m06.t02.test.junit4;

import static org.junit.Assert.assertTrue;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest_isPrimeExceptionTest {

    private static Calcable calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPrime_NegativeNum() {
        calc.isPrime(-11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPrime_Zero() {
        calc.isPrime(0);
    }

    @Test
    public void testIsPrime_One() {
        assertTrue(calc.isPrime(1));
    }
}
