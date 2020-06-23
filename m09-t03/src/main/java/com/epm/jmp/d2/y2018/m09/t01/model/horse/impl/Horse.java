package com.epm.jmp.d2.y2018.m09.t01.model.horse.impl;

import com.epm.jmp.d2.y2018.m09.t01.model.horse.IHorse;
import com.epm.jmp.d2.y2018.m09.t01.model.horse.breed.Breed;
import com.epm.jmp.d2.y2018.m09.t01.model.rider.IRider;

public class Horse implements IHorse {

    private String petname;
    private Breed breed;

    private int raceSpeed;
    private IRider raceRider;

    public Horse(String petname, Breed breed) {
        super();
        this.petname = petname;
        this.breed = breed;
    }

    public String getPetname() {
        return petname;
    }
    public void setPetname(String petname) {
        this.petname = petname;
    }

    public Breed getBreed() {
        return breed;
    }
    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public IRider getRaceRider() {
        return raceRider;
    }
    public void setRaceRider(IRider rider) {
        this.raceRider = rider;
    }

    public int getRaceSpeed() {
        return raceSpeed;
    }

    public void setRaceSpeed(int raceSpeed) {
        this.raceSpeed = raceSpeed;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        result = prime * result + ((petname == null) ? 0 : petname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Horse other = (Horse) obj;
        if (breed == null) {
            if (other.breed != null)
                return false;
        } else if (!breed.equals(other.breed))
            return false;
        if (petname == null) {
            if (other.petname != null)
                return false;
        } else if (!petname.equals(other.petname))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Horse [petname=" + petname + ", breed=" + breed + ", raceRider=" + raceRider + "]";
    }



}
