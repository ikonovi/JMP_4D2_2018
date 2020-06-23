package com.epm.jmp.d2.y2018.m06.t01.test.junit5;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import com.epm.jmp.d2.y2018.m06.t01.Utils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;


public class UtilsTest_t1_3 {

    @Test
    public void testFactorial_WithTimeout() {
        int bound = 10000;
        long number = new Random().nextInt(bound);

        assertTimeout(ofMillis(100), () -> {
            Utils.computeFactorial(number);
        });
    }



    @BeforeAll
    public static void beforeTestSuite() {

    }

    @AfterAll
    public static void afterTestSuite() {

    }

    @BeforeEach
    public void beforeTest() {

    }

    @AfterEach
    public void afterTest() {

    }

}
