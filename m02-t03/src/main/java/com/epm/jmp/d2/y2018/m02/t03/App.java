package com.epm.jmp.d2.y2018.m02.t03;

import java.io.IOException;

/**
 * Task 3. (10 points) MAT for heap dump analysis
 *
 * 1. Write simple application that consumes memory or take your mentoring pet application
 *
 * 2. Catch java.lang.OutOfMemoryError: Java heap space
 *
 * 3. Make heap dump (-XX:+HeapDumpOnOutOfMemoryError or via visualvm)
 *
 * 4. With Memory Analyzer Tool generate report that shows which classes are consuming the memory
 *
 * Share results with mentor in essay format
 *
 */
public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        HumanGeneration adamAndEva = new HumanGeneration();
        HumanGeneration ancestry = new HumanGeneration(adamAndEva, adamAndEva.getSins());
        do {
            HumanGeneration descendant = new HumanGeneration(ancestry, ancestry.getSins());
            ancestry = descendant;
        } while (true);
    }
}
