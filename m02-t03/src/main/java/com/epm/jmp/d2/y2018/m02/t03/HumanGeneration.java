package com.epm.jmp.d2.y2018.m02.t03;

import java.util.concurrent.atomic.AtomicInteger;

public class HumanGeneration {

    private static AtomicInteger counter = new AtomicInteger();
    private String sins = "";
    private HumanGeneration ancestry;

    public HumanGeneration() {
        System.out.println(
                "Human generation #" + counter.incrementAndGet() + " Created by God. No sins.");
    }

    public HumanGeneration(HumanGeneration ancestry, String ancestrySins) {
        this.ancestry = ancestry;
        this.sins = "NumanSins" + this.hashCode() + ancestrySins;
        counter.incrementAndGet();
        // Test output to see that burden of every new generation is growing (Please, don't take it serious too much).
        if (counter.get() == 50)
            System.out.println("Human generation #" + counter.get() + " with burden of ancestry "
                    + ancestrySins);
    }

    public String getSins() {
        return sins;
    }

    public HumanGeneration getAncestry() {
        return ancestry;
    }
}
