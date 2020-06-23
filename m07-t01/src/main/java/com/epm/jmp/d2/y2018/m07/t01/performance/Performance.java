package com.epm.jmp.d2.y2018.m07.t01.performance;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Performance {

    private Map<String, String> map = new Hashtable<String, String>();

    Runnable fix_custom_map_without_synch = new Runnable() {

        public void run() {
            try {
                com.epm.jmp.d2.y2018.m07.t01.fix_custom_map_without_synch.DasExperiment.main(null);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable fix_custom_map_with_synch = new Runnable() {

        public void run() {
            try {
                com.epm.jmp.d2.y2018.m07.t01.fix_custom_map_with_synch.DasExperiment.main(null);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable fix_csm = new Runnable() {

        public void run() {
            try {
                com.epm.jmp.d2.y2018.m07.t01.fix_csm.DasExperiment.main(null);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable fix_chm = new Runnable() {

        public void run() {
            try {
                com.epm.jmp.d2.y2018.m07.t01.fix_chm.DasExperiment.main(null);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public void measure(Runnable r, String packageName) throws InterruptedException {
        DateTime start, end;
        DateTimeFormatter format = DateTimeFormat.forPattern("mm:ss:SSS");

        start = DateTime.now();
        Thread t = new Thread(r);
        t.start();
        t.join();
        end = DateTime.now();

        Duration duration = new Duration(start, end);
        map.put(packageName, format.print(duration.getMillis()));

        System.out
                .println("Duration: " + packageName + " -> " + format.print(duration.getMillis()));
    }

    public static void main(String[] args) throws InterruptedException {

        Performance p = new Performance();

        p.measure(p.fix_custom_map_without_synch, "fix_custom_map_without_synch");
        p.measure(p.fix_custom_map_with_synch, "fix_custom_map_with_synch");
        p.measure(p.fix_csm, "fix_csm");
        p.measure(p.fix_chm, "fix_chm");

        for (Entry<String, String> entry : p.map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
