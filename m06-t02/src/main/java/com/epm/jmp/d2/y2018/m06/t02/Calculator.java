package com.epm.jmp.d2.y2018.m06.t02;

public class Calculator implements Calcable {

    @Override
    public double divide(double x, double y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return x / y;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public double power(double x, double n) throws IllegalArgumentException {
        if (x == 0) {
            throw new IllegalArgumentException("Zero cannot be raised to the power");
        }
        return Math.pow(x, n);
    }

    @Override
    public double subtract(double x, double y) {
        return x - y;
    }

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

    @Override
    public double sum(double x, double y) {
        return x + y;
    }

    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public boolean isPrime(long number) {
        boolean result = true;
        if (number < 1) {
            throw new IllegalArgumentException("Argument is not a natural number");
        }
        if (number == 1) {
            result = true;
        } else {
            int stop = (int) Math.sqrt(number);
            for (int divisor = 2; divisor <= stop; divisor++) {
                if (number % divisor == 0) {
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * Provides sequence of positive Fibonacci numbers starting from 0.
     *
     * @param num - number of Fibonacci numbers to produce
     * @return  sequence of Fibonacci numbers
     */
    public int[] fibonacci(int num) {

        int[] fibs = new int[num + 1];
        fibs[0] = 0;
        fibs[1] = 1;

        for (int i = 2; i <= num; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }

        return fibs;
    }

}
