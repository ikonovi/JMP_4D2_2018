package com.epm.jmp.d2.y2018.m06.t01.test.junit4;

import static org.junit.Assert.assertEquals;

import com.epm.jmp.d2.y2018.m06.t01.Utils;
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

@RunWith(Parameterized.class)
public class UtilsTest_t1_1 {

    private String leftWord;
    private String rightWord;
    private String concatenatedWord;

    public UtilsTest_t1_1(String leftWord, String rightWord, String concatenatedWord) {
        this.leftWord = leftWord;
        this.rightWord = rightWord;
        this.concatenatedWord = concatenatedWord;
    }

    @Parameters(name = "{index}: concatenateWords({0}, {1}) = {2}")
    public static Collection<Object[]> words() {
        return Arrays.asList(new Object[][] {
            {"word1", "word2", "word1word2"},
            {"word1", "", "word1"},
            {"", "word2", "word2"},
            {"", "", ""},
            {"word1", null, "word1"},
            {null, "word2", "word2"},
            {null, null, ""}
            }
        );
    }

    @Test
    public void testConcatenateWords() {
        String actual = Utils.concatenateWords(leftWord, rightWord);
        assertEquals(concatenatedWord, actual);
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
