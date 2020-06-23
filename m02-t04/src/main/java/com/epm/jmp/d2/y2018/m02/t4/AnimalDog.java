package com.epm.jmp.d2.y2018.m02.t4;

public class AnimalDog extends Animal {

    @Override
    public void play() {
        String message = "Play with stick";
        logger.info(message);
    }

    @Override
    public void voice() {
        String message = "Gav-Gav";
        logger.info(message);
    }
}
