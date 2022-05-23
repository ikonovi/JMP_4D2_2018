package com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.impl;

import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.Breed;

public class BlazerHorseBreed implements Breed {

    private String regestedName;
    private HorseBreedType breedType;
    private boolean isColored;

    public BlazerHorseBreed(String regestedName) {
        super();
        this.regestedName = regestedName;
    }

    public BlazerHorseBreed(String regestedName, HorseBreedType breedType, boolean isColored) {
        super();
        this.regestedName = regestedName;
        this.breedType = breedType;
        this.isColored = isColored;
    }

    public String getRegestedName() {
        return regestedName;
    }

    public HorseBreedType getBreedType() {
        return breedType;
    }

    public void setBreedType(HorseBreedType breedType) {
        this.breedType = breedType;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean isColored) {
        this.isColored = isColored;
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
        BlazerHorseBreed other = (BlazerHorseBreed) obj;
        if (regestedName == null) {
            if (other.regestedName != null)
                return false;
        } else if (!regestedName.equals(other.regestedName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BlazerHorseBreed [regestedName=" + regestedName + ", breedType=" + breedType
                + ", isColored=" + isColored + "]";
    }


}
