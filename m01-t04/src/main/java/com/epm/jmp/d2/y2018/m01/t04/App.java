package com.epm.jmp.d2.y2018.m01.t04;

/**
 *
 * Task 4. (5 points) Custom Functional Interface
 *
 * 1. Write your own functional interface ThreeFunction (it takes three arguments and produce result).
 *
 * 2. Implement this with two different lambdas
 *
 * 3. Provide client code with usage of this lambdas
 *
 */
public class App {

    private int number1;
    private int number2;
    private int number3;
    private int result;

    public App(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public void calculate(ThreeFunction<Integer> f) {
        result = f.doCalculation(number1, number2, number3);
    }

    public void printResult() {
        System.out.printf("Calculation result is %d\n", result);
    }


    public static void main(String[] args) {

        ThreeFunction<Integer> summarize = (a, b, c) -> a + b + c;
        ThreeFunction<Integer> multiply = (a, b, c) -> a * b * c;

        App appSum = new App(3, 3, 3);
        appSum.calculate(summarize);
        appSum.printResult();

        App appMultiplication = new App(3, 3, 3);
        appMultiplication.calculate(multiply);
        appMultiplication.printResult();
    }

}
