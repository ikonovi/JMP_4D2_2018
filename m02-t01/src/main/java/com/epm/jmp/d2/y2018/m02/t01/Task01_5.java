package com.epm.jmp.d2.y2018.m02.t01;


/**
 * Task 1. (20 points)
 *
 * Design and implement code that will introduce:
 *
 * 5. java.lang.StackOverflowError. Do not use recursive methods. Don’t tune stack size.
 *
 */
public class Task01_5 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.setB(b);
        b.setA(a);

        a.aDoes();
    }
}


class A {
    private B b;

    public void setB(B b) {
        this.b = b;
    }

    void aDoes() {
        b.bDoes();
    }
}


class B {
    private A a;

    public void setA(A a) {
        this.a = a;
    }

    void bDoes() {
        a.aDoes();
    }
}
