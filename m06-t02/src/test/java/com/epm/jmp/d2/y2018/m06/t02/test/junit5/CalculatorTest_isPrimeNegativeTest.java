package com.epm.jmp.d2.y2018.m06.t02.test.junit5;


import static org.junit.jupiter.api.Assertions.assertFalse;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;


public class CalculatorTest_isPrimeNegativeTest {

    private static Calcable calc;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    public static Collection<Long> notPrimaryNumber() {
        return Arrays.asList(4L, 6L, 8L, 555L, 6369L);
    }

    @ParameterizedTest(name = "check #{index}: isPrime({0})")
    @MethodSource("notPrimaryNumber")
    public void testIsPrime_negative(long number) {
        assertFalse(calc.isPrime(number));
    }

}
