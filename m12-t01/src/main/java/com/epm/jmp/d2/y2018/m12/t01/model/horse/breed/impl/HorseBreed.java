package com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.impl;

import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.Breed;

public class HorseBreed implements Breed {

    private String regestedName;
    private HorseBreedType breedType;

    public HorseBreed(String regestedName) {
        super();
        this.regestedName = regestedName;
    }

    public HorseBreed(String regestedName, HorseBreedType breedType) {
        super();
        this.regestedName = regestedName;
        this.breedType = breedType;
    }

    public String getRegestedName() {
        return regestedName;
    }

    public void setRegestedName(String regestedName) {
        this.regestedName = regestedName;
    }

    public HorseBreedType getBreedType() {
        return breedType;
    }

    public void setBreedType(HorseBreedType breedType) {
        this.breedType = breedType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((regestedName == null) ? 0 : regestedName.hashCode());
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
        HorseBreed other = (HorseBreed) obj;
        if (regestedName == null) {
            if (other.regestedName != null)
                return false;
        } else if (!regestedName.equals(other.regestedName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HorseBreed [regestedName=" + regestedName + ", breedType=" + breedType + "]";
    }

    @Override
    public boolean isColored() {
        // TO-DO Auto-generated method stub
        return false;
    }

    @Override
    public void setColored(boolean isColored) {
        // TO-DO Auto-generated method stub

    }

}
