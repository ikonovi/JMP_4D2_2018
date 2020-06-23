package com.epm.jmp.d2.y2018.m06.t01.test.junit5;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.epm.jmp.d2.y2018.m06.t01.Utils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilsTest_t1_4 {

    @Test
    public void testFactorial_ExpectedException() {
        long number = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            Utils.computeFactorial(number);
        }, "The number must be more than zero to calculate factorial of it.");
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
