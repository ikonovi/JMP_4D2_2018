package com.epm.jmp.d2.y2018.m02.t4;

public class AnimalCat extends Animal {

    @Override
    public void play() {
        String message = "Play with mouse";
        logger.info(message);
    }

    @Override
    public void voice() {
        String message = "Miay";
        logger.info(message);
    }
}
