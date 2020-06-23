package com.epm.jmp.d2.y2018.m06.t01.test.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epm.jmp.d2.y2018.m06.t01.Utils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UtilsTest_t1_2 {

    static Integer[][]  numAndFactProvider() {
        return new Integer[][] {
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
            {10, 3_628_800}
        };
    }

    @ParameterizedTest
    @MethodSource("numAndFactProvider")
    public void testComputeFactorial(int number, int expectedFactorial) {
        long actualFactorial = Utils.computeFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
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
