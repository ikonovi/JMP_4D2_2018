package com.epm.jmp.d2.y2018.m09.t01.model.breed.impl;

import com.epm.jmp.d2.y2018.m09.t01.model.breed.Breed;

public class ColorBreed implements Breed {

    private String regestedName;

    public ColorBreed(String regestedName) {
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
        ColorBreed other = (ColorBreed) obj;
        if (regestedName == null) {
            if (other.regestedName != null)
                return false;
        } else if (!regestedName.equals(other.regestedName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ColorBreed [regestedName=" + regestedName + "]";
    }

}
