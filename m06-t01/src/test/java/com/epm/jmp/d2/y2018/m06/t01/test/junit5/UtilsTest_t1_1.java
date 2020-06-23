package com.epm.jmp.d2.y2018.m06.t01.test.junit5;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epm.jmp.d2.y2018.m06.t01.Utils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class UtilsTest_t1_1 {

    static String[][] wordsAndConcatinationProvider() {
        return
                new String[][] {
                    {"word1", "word2", "word1word2"},
                    {"word1", "", "word1"},
                    {"", "word2", "word2"},
                    {"", "", ""},
                    {"word1", null, "word1"},
                    {null, "word2", "word2"},
                    {null, null, ""}
        };
    }

    @ParameterizedTest
    @MethodSource("wordsAndConcatinationProvider")
    public void testConcatenateWords(String leftWord, String rightWord, String concatenatedWord) {
        String actual = Utils.concatenateWords(leftWord, rightWord);
        assertEquals(concatenatedWord, actual);
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
