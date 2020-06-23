package com.epm.jmp.d2.y2018.m06.t01.test.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

import com.epm.jmp.d2.y2018.m06.t01.Utils;

@RunWith(Parameterized.class)
public class UtilsTest_t1_2 {

    private long number;
    private long expectedFactorial;

    public UtilsTest_t1_2(long number, long factorial) {
        this.number = number;
        this.expectedFactorial = factorial;
    }

    @Parameters(name = "{index}: fact({0})) = {1}")
    public static Collection<Object[]> numAndFactorial() {
        return Arrays.asList(new Object[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720},
            {7, 5_040},
            {8, 40_320},
            {9, 362_880},
            {10, 3_628_800},
            }
        );
    }

    @Test
    public void testComputeFactorial() {
        long actualFactorial = Utils.computeFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);

    }


    @BeforeClass
    public static void beforeTestSuite() {

    }

    @AfterClass
    public static void afterTestSuite() {

    }

    @Before
    public void beforeTest() {

    }

    @After
    public void afterTest() {

    }

}
