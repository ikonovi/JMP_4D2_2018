package com.epm.jmp.d2.y2018.m12.t01.model.horse.breed;

import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.impl.HorseBreedType;

public interface Breed {

    String getRegestedName();

    HorseBreedType getBreedType();

    void setBreedType(HorseBreedType breedType);

    boolean isColored();

    void setColored(boolean isColored);

}
