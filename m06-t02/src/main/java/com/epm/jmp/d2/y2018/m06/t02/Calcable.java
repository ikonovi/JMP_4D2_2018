package com.epm.jmp.d2.y2018.m06.t02;


/**
 * Операция (математика)
 * https://ru.wikipedia.org/wiki/%D0%9E%D0%BF%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D1%8F_(%D0%BC%D0%B0%D1%82%D0%B5%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0)
 * http://cs-fundamentals.com/java-programming/java-primitive-data-types.php
 *
 */
public interface Calcable {

    public double divide(double x, double y) throws IllegalArgumentException;

    public double multiply(double x, double y);

    public int multiply(int x, int y);

    /**
     * x to the power of y
     *
     * @param x - number
     * @param y - power
     * @return
     * @throws IllegalArgumentException
     */
    public double power(double x, double y) throws IllegalArgumentException;

    public double subtract(double x, double y);

    public int subtract(int x, int y);

    public double sum(double x, double y);

    public int sum(int x, int y);

    /**
     * The prime numbers are the natural numbers greater than one that are not products of two smaller numbers.
     *
     * @param x - natural number
     * @return
     */
    public boolean isPrime(long x);

    public int[] fibonacci(int num);
}
