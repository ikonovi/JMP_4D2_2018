package com.epm.jmp.d2.y2018.m07.t01.fix_custom_map_with_synch;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/**
 * Task 1. (20 points) “Das Experiment”
 *
 * ..
 * 2.   Try to write your custom ThreadSafeMap with synchronization and without.
 * ..
 *
 * @author Igar_Kanavalau
 *
 */
public class DasExperiment {

    //private Map<Integer, Integer> map = new HashMap<>(); // Original, that is not thread-safe.
    private Map<Integer, Integer> map = new ThreadSafeMapWithSynch<Integer, Integer>();

    private final static long ADDING_DELAY = 30; // milliseconds
    private final static long SUMMING_DELAY = 300;
    private final static int ADDING_LOOPS_COUNT = 500;
    private final static int SUMMING_LOOPS_COUNT = 100;

    Runnable runAddingElements = new Runnable() {

        public void run() {
            int key = 0;
            int value = 0;
            int loop = 0;
            Random random = new Random();

            while (++loop <= ADDING_LOOPS_COUNT) {
                //value = ThreadLocalRandom.current().nextInt();
                value = random.nextInt();
                map.put(++key, value);

                System.out.println(Thread.currentThread().getName() + " loop #" + loop + ": " + key + " -> " + value);
                try {
                    Thread.sleep(ADDING_DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    };

    Runnable runSummingValues = new Runnable() {

        public void run() {
            Integer key = 0;
            Integer value = 0;
            int loop = 0;

            while (++loop <= SUMMING_LOOPS_COUNT) {
                synchronized (map) { // FIX-part2: "manually synchronize on the returned map when iterating over any of its collection views"
                    key = map.keySet().size() == 0 ? 0 : Collections.max(map.keySet());
                    for (Entry<Integer, Integer> element : map.entrySet()) {
                        value += element.getValue();
                    }
                    map.put(++key, value);
                }

                System.out.println(Thread.currentThread().getName() + " loop #" + loop + ": " + key + " -> " + value);
                try {
                    Thread.sleep(SUMMING_DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    };


    public static void main(String[] args) throws InterruptedException {

        DasExperiment expFantastischen = new DasExperiment();

        Thread addsElements = new Thread(expFantastischen.runAddingElements, "Thread-adding");
        Thread sumValues = new Thread(expFantastischen.runSummingValues, "Thread-summing");

        addsElements.start();
        sumValues.start();

        addsElements.join();
        sumValues.join();

        System.out.println(" - Finish - ");
    }
}
