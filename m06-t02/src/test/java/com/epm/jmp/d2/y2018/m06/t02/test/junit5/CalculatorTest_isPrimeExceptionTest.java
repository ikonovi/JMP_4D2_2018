package com.epm.jmp.d2.y2018.m06.t02.test.junit5;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest_isPrimeExceptionTest {

    private static Calcable calc;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testIsPrime_NegativeNum() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.isPrime(-11);
        }, "Argument is not a natural number");
    }

    @Test
    public void testIsPrime_Zero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.isPrime(0);
        }, "Argument is not a natural number");
    }

    @Test
    public void testIsPrime_One() {
        assertTrue(calc.isPrime(1));
    }
}
