package com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.impl;

import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.Breed;

public class PonyBreed implements Breed {

    private String regestedName;

    public PonyBreed(String regestedName) {
        super();
        this.regestedName = regestedName;
    }

    public String getRegestedName() {
        return regestedName;
    }

    public void setRegestedName(String regestedName) {
        this.regestedName = regestedName;
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
        PonyBreed other = (PonyBreed) obj;
        if (regestedName == null) {
            if (other.regestedName != null)
                return false;
        } else if (!regestedName.equals(other.regestedName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PonyBreed [regestedName=" + regestedName + "]";
    }

    @Override
    public HorseBreedType getBreedType() {
        // TO-DO Auto-generated method stub
        return null;
    }

    @Override
    public void setBreedType(HorseBreedType breedType) {
        // TO-DO Auto-generated method stub

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
