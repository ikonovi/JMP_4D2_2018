package com.epm.jmp.d2.y2018.m06.t02.test.junit4;

import static org.junit.Assert.assertTrue;

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
public class CalculatorTest_isPrimePositiveTest {

    private static Calcable calc;
    private long number;

    public CalculatorTest_isPrimePositiveTest(long number) {
        this.number = number;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Parameters(name = "{index}: isPrime({0})")
    public static Collection<Integer> primaryNumber() {
        return Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
                71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157,
                163, 167, 173, 179, 181, 191, 193, 197, 199, 557);
    }

    @Test
    public void testIsPrime() {
        assertTrue(calc.isPrime(number));
    }

}
