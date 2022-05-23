package com.epm.jmp.d2.y2018.m09.t01.service;

import com.epm.jmp.d2.y2018.m09.t01.model.horse.IHorse;

import java.util.List;
import java.util.Random;

/**
 * it generates data about horses positions on the console for every second
 *
 */
public class EmulationService {

    private HorseService<IHorse> horseService;

    public EmulationService(HorseService<IHorse> horseService) {
        this.horseService = horseService;
    }

    public int generateHorsePacesPerIterationToFinish() {
        Random r = new Random();
        int streamSize = 1;
        int randomNumFromInclusive = 1;
        int randomNumToExclusive = 7;
        return r.ints(streamSize, randomNumFromInclusive, randomNumToExclusive).toArray()[0];
    };

    public List<IHorse> emulateRaceHorses() {
        return horseService.getHorses();
    }

}
