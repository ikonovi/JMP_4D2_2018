package com.epm.jmp.d2.y2018.m06.t02.test.junit5;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class CalculatorTest_isPrimeTimeOutTest {

    private static Calculator calc;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testIsPrime_timeOut() {
        assertTimeout(ofMillis(5000), () -> {
            calc.isPrime(213469632346256246L);
        });
    }

}
