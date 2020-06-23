package com.epm.jmp.d2.y2018.m02.t4;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 2. (10 points) Visual VM + GC Plugin
 *
 * Connect to the running JVM with VisualVM with installed GC plugin. Observe GC curve and memory regions.
 *
 * 1. Apply changes to the following app code to make GC curve have peaks that are more frequent.
 *
 */
public class MainT21 {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<Object>();

        long i = 0;
        while (true) {
            list.add(new Object());

            list.add(new String("garbitch"));
            list.add(new String("garbitch"));
            list.add(new String("garbitch"));

            i++;
            if (i % 100000 == 0) {
                for (int j = 0; j < 10; j++) {
                    list.remove(j);
                }
            }

        }

    }

}
