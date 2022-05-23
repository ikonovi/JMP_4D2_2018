package com.epm.jmp.d2.y2018.m12.t01.model.horse;

import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.Breed;
import com.epm.jmp.d2.y2018.m12.t01.model.rider.IRider;

public interface IHorse {

    String getPetname();

    Breed getBreed();

    IRider getRaceRider();

    int getRaceSpeed();

    void setRaceSpeed(int raceSpeed);

    void setRaceRider(IRider rider);

}
