package com.epm.jmp.d2.y2018.m01.t03;

@FunctionalInterface
interface MyPrinter<T> {

    abstract void print(T t);

    default void printObjType(T t) {
        System.out.println("It's going to be printed the object of type " + t.getClass().getSimpleName());
    }

    static void getPrinterInfo() {
        System.out.println("Igar's printer at room 501.");
    }

    static void getPrinterColor() {
        System.out.println("Printer of White color.");
    }

}
