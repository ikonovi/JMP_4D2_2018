# m06-t01

### Guess about functionality and implement tests

Create class Utils with a few methods. Write tests to cover these methods. Use TDD approach.

1.	Write a test for concatenateWords method using AssertEquals. 
2.	Create test method testComputeFactorial.  
3.	Add method testFactorialWithTimeout, that calculates factorial of random number. Add possibility of timeout and interruption of thread if time for method execution will be exceeded
4.	Add method testExpectedException for calling computeFactorial with variable "-5". Add corresponding parameter to the annotation @Test for IllegalArgumentException raising when necessary as the result of test execution 
5.	To disable test, add annotation @Ignore under the annotation @Test. Disable test method testNormalizeWord*. 
6.	All the tests should contain necessary annotations (@BeforeClass, @Before, @After, @AfterClass)
