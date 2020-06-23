package com.epm.jmp.d2.y2018.m02.t01;

/**
 *
 * Task 1. (20 points)
 *
 * Design and implement code that will introduce:
 *
 * 4. java.lang.StackOverflowError. Use recursive methods. Don’t tune stack size.
 *
 */
public class Task01_4 {

    public static void main(String[] args) {
        new Task01_4().foo();
    }

    void foo() {
        foo();
    }
}



