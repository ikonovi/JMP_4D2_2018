package com.epm.jmp.d2.y2018.m09.t01.model.impl;

import com.epm.jmp.d2.y2018.m09.t01.model.IRace;

public class Race implements IRace {

    private short duration;



    public Race(short duration) {
        super();
        this.duration = duration;
    }

    public short getDuration() {
        return duration;
    }

    @Override
    public void begin() {
        System.out.println("Started");

    }

    @Override
    public void finish() {
        System.out.println("Finished");
    }

    @Override
    public String toString() {
        return "Race [duration=" + duration + "]";
    }


}
