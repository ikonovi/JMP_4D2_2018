package com.epm.jmp.d2.y2018.m06.t01.test.junit4;

import com.epm.jmp.d2.y2018.m06.t01.Utils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtilsTest_t1_4 {

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_ExpectedException () {
        long number = -5;
        Utils.computeFactorial(number);
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
