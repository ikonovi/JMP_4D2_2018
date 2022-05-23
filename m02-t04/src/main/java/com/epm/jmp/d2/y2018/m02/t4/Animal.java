package com.epm.jmp.d2.y2018.m02.t4;

import org.apache.log4j.Logger;

public abstract class Animal {

    protected static final Logger logger = Logger.getLogger(Animal.class);

    abstract void play();

    abstract void voice();
}
