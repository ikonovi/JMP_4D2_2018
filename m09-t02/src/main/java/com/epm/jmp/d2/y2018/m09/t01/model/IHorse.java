package com.epm.jmp.d2.y2018.m09.t01.model;

import com.epm.jmp.d2.y2018.m09.t01.model.breed.Breed;

public interface IHorse {

    String getPetname();

    Breed getBreed();

    IRider getRaceRider();

    int getRaceSpeed();

    void setRaceSpeed(int raceSpeed);

}
