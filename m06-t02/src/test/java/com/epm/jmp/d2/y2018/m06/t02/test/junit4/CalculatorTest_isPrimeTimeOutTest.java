package com.epm.jmp.d2.y2018.m06.t02.test.junit4;

import static org.junit.Assert.assertFalse;

import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest_isPrimeTimeOutTest {

    private static Calculator calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test(timeout = 10000)
    public void testIsPrime_timeOut() {
        assertFalse(calc.isPrime(213469632346256246L));
    }

}
