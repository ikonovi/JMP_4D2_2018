package com.epm.jmp.d2.y2018.m06.t01.test.junit4;

import com.epam.jmp.d2.y2018.m06.t01.Utils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;


public class UtilsTest_t1_3 {

    @Test(timeout = 100)
    public void testFactorial_WithTimeout() {
        int bound = 10000;
        long number = new Random().nextInt(bound);
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
