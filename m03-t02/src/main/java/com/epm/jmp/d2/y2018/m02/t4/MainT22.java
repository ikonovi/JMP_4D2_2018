package com.epm.jmp.d2.y2018.m02.t4;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 2. (10 points) Visual VM + GC Plugin
 *
 * Connect to the running JVM with VisualVM with installed GC plugin. Observe GC curve and memory regions.
 *
 * 2. Tune GC settings via JVM flags (change GC, maybe) to make GC curve have peaks that are more frequent.
 *
 */
public class MainT22 {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<Object>();
        while (true) {
            list.add(new Object());
        }
    }

}
