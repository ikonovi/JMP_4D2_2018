package com.epm.jmp.d2.y2018.m07.t02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Threads in this class are not synchronized. Hence it throws java.util.ConcurrentModificationException during runtime.
 *
 *
 * @author Igar_Kanavalau
 *
 */
public class DeadlocksNoSynch {

    private List<Integer> numbers = new ArrayList<>();
    private static final short WRITE_DELAY = 10; // milliseconds
    private static final short WRITE_LOOPS = 60;
    private static final short SUM_DELAY = 30;
    private static final short SUM_LOOPS = 20;
    private static final short SQUARE_DELAY = 15;
    private static final short SQUARE_LOOPS = 30;

    private Runnable write = () -> {
        int loop = 1;
        do {
            int randomNum = ThreadLocalRandom.current().nextInt();
            numbers.add(randomNum);
            System.out.println(Thread.currentThread().getName() + ": loop-#" + loop
                    + " wrote number: " + randomNum);
            try {
                Thread.sleep(DeadlocksNoSynch.WRITE_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (++loop <= WRITE_LOOPS);
    };

    private Runnable sum = () -> {
        int loop = 1;
        do {
            Integer sum = numbers.stream().reduce(0, (x, y) -> x + y);
            System.out
                    .println(Thread.currentThread().getName() + ": loop-#" + loop + " sum: " + sum);
            try {
                Thread.sleep(DeadlocksNoSynch.SUM_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (++loop <= SUM_LOOPS);
    };

    private Runnable squareRoot = () -> {
        int loop = 1;
        do {
            Integer sumOfSquares = numbers.stream().reduce(0, (x, y) -> x * x + y * y);
            double squareRoot = Math.sqrt(sumOfSquares);
            System.out.println(Thread.currentThread().getName() + ": loop-#" + loop
                    + " square root of sum of squares: " + squareRoot);
            try {
                Thread.sleep(DeadlocksNoSynch.SQUARE_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (++loop <= SQUARE_LOOPS);
    };


    public static void main(String[] args) throws InterruptedException {

        DeadlocksNoSynch dl = new DeadlocksNoSynch();

        Thread tWriting = new Thread(dl.write, "thread-writing");
        Thread tSumming = new Thread(dl.sum, "thread-summing");
        Thread tSquare = new Thread(dl.squareRoot, "thread-square");
        tWriting.start();
        tSumming.start();
        tSquare.start();
        tWriting.join();
        tSumming.join();
        tSquare.join();

        dl.numbers.forEach((n) -> System.out.print(n + ", "));
        System.out.println("\n << Finish >> ");

    }

}
