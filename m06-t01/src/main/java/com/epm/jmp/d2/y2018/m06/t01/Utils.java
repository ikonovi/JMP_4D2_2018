package com.epm.jmp.d2.y2018.m06.t01;

/**
 *
 * Task 1. (15 points) Guess about functionality and implement tests
 * ------------------------------------------------------------------
 *
 * Create class Utils with a few methods. Write tests to cover these methods. Use TDD approach.
 *
 * 1. Write a test for concatenateWords method using AssertEquals.
 *
 * 2. Create test method testComputeFactorial.
 *
 * 3. Add method testFactorialWithTimeout, that calculates factorial of random number. Add possibility of timeout and
 * interruption of thread if time for method execution will be exceeded
 *
 * 4. Add method testExpectedException for calling computeFactorial with variable "-5". Add corresponding parameter to
 * the annotation @Test for IllegalArgumentException raising when necessary as the result of test execution
 *
 * 5. To disable test, add annotation @Ignore under the annotation @Test. Disable test method testNormalizeWord*.
 *
 * 6. All the tests should contain necessary annotations (@BeforeClass, @Before, @After, @AfterClass)
 *
 * bring or return to a normal or standard condition or state (look here for example)
 *
 */
public class Utils {

    /**
     * Contaminate two words into one word.
     *
     * @param word1 - a word to concatenate from left side
     * @param word2 - a word to concatenate from right side
     * @return
     */
    public static String concatenateWords(String word1, String word2) {
        if (word1 == null)
            word1 = new String();
        if (word2 == null)
            word2 = new String();
        return word1 + word2;
    }

    /**
     * Calculates factorial of given number
     *
     * @param num - positive number
     * @return factorial of number num
     * @throws Exception when num is a negative number
     */
    public static long computeFactorial(long num) throws IllegalArgumentException {
        long result = 0;

        if (num < 0) {
            throw new IllegalArgumentException(
                    "The number must be more than zero to calculate factorial of it.");

        } else if (num == 0 || num == 1) {
            result = 1;

        } else if (num > 1) {
            result = num * computeFactorial(num - 1);
        }

        return result;
    }

}
