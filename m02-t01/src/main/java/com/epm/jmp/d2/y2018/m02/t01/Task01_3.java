package com.epm.jmp.d2.y2018.m02.t01;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.Loader;


/**
 *
 * * Task 1. (20 points)
 *
 * Design and implement code that will introduce:
 *
 * 3. java.lang.OutOfMemoryError: Metaspace. Load classes continuously and make them stay in memory.
 *
 * NOTE: Before to run main() method in the class, set JVM option "-XX:MaxMetaspaceSize=128m" to archive result -
 * "Exception in thread "main" java.lang.OutOfMemoryError: Metaspace"
 *
 */
public class Task01_3 {


    public static void main(String[] args) {

        ClassPool classPool = ClassPool.getDefault();
        Loader loader = new Loader(classPool);
        String clazzNameTemplate = "com.epm.jmp.d2.y2018.m02.t01.HeavyClazz";
        int i = 0;

        while (true) {
            i++;
            CtClass ctClazz = classPool.makeClass((clazzNameTemplate + i));
            String ctClazzName = ctClazz.getName();

            if (i % 10000 == 0) // test output
                System.out.println(ctClazzName);

            try {
                loader.loadClass(ctClazzName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
