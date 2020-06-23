package com.epm.jmp.d2.y2018.m12.t01.model.race.impl;

import com.epm.jmp.d2.y2018.m12.t01.model.race.IRace;

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
