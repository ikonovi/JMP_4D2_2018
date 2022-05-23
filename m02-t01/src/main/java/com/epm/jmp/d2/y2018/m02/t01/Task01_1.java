package com.epm.jmp.d2.y2018.m02.t01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Task 1. (20 points)
 *
 * Design and implement code that will introduce:
 *
 * 1. java.lang.OutOfMemoryError: Java heap space. You can use different data structures. Do not tune heap size.
 *
 */
public class Task01_1 {

    public static void main(String[] args) {

        System.out.println("Max amount of memory that JVM will attempt to use: "
                + Runtime.getRuntime().maxMemory() + " bytes.\n");

        /*
         * Task 1.1
         *
         * Algorithm: Each next String object added to collection, is twice bigger than previous one.
         *
         * Cause of error: object could not be allocated in the Java heap.
         */
        List<String> list = new ArrayList<>();
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; ; i++) {
            try {
                list.add(str);
            } catch (OutOfMemoryError ex) {
                System.out.println("Task 1.1: Failed by adding element with index " + i);
                ex.printStackTrace();
                break;
            }
        }
    }

}
