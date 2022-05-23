package com.epm.ik;

public class Task {

    public static void main(String[] args) {
        Runnable hipRunnable = () -> {
            System.out.print("Hip_ ");
        };

        Runnable hopRunnable = () -> {
            System.out.print("Hop^ ");
        };

        for (int i = 0; i < 10; i++) {
            new Thread(hipRunnable).start();
            new Thread(hopRunnable).start();
        }
    }
}
