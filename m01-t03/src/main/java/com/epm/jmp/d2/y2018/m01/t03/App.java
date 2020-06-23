package com.epm.jmp.d2.y2018.m01.t03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * Task 3. (10 points) Functional Interface Sandbox
 *
 * 1. Implement each of main Java Standard Library functional interfaces (supplier, predicate etc.) using lambda
 * expressions.
 *
 * 2. Create your own functional interface and add several implementations using both lambda expressions and inner
 * anonymous classes.
 *
 * 3. Add a few default methods to it and use them.
 *
 * 4. Add a few static methods to it and use them.
 *
 */
public class App {

    // Function
    public Function<String, String> applyWhitespaceRemoving = (String s1) -> s1.replaceAll(" ", "");

    // Consumer
    public Consumer<Number> acceptNumberForPrinting = num -> {
        System.out.println(num);
    };

    // Predicate
    public Predicate<Integer> testOnEvenness = i -> i % 2 == 0 ? true : false;

    // Supplier
    public Supplier<Object> sypplyNewObjectInstance = () -> new Object();


    public void print(MyPrinter<String> printer, String s) {
        printer.printObjType(s);
        printer.print(s);
    }

    public void getPrinterInfo() {
        MyPrinter.getPrinterInfo();
        MyPrinter.getPrinterColor();
    }

    public static void main(String[] args) {

        // functional interface implementations
        MyPrinter<String> printerWithAsterisks = str -> System.out.println(str + " ***");
        MyPrinter<String> printerWithDashes = new MyPrinter<String>() {
            @Override
            public void print(String t) {
                System.out.println(t + " ---");
            }
        };

        // Use of all above
        App app = new App();
        app.getPrinterInfo();
        app.print(printerWithDashes, "Page 1");
        app.print(printerWithAsterisks, "Page 2");
    }

}
