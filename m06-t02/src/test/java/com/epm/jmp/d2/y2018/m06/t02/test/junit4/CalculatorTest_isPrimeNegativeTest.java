package com.epm.jmp.d2.y2018.m06.t02.test.junit4;

import static org.junit.Assert.assertFalse;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorTest_isPrimeNegativeTest {

    private static Calcable calc;
    private long number;

    public CalculatorTest_isPrimeNegativeTest(long number) {
        this.number = number;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Parameters(name = "{index}: isPrime({0})")
    public static Collection<Long> notPrimaryNumber() {
        return Arrays.asList(4L, 6L, 8L, 555L, 6369L);
    }

    @Test
    public void testIsPrime_negative() {
        assertFalse(calc.isPrime(number));
    }

}
