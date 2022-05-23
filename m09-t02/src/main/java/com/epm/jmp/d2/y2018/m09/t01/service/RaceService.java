package com.epm.jmp.d2.y2018.m09.t01.service;

import com.epm.jmp.d2.y2018.m09.t01.model.IHorse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RaceService {

    //private IRace race;
    private List<IHorse> raceHorses;
    private int raceWinnerNumberActual; // not index of object in collection
    private int raceWinnerNumberUserChoice;
    private Optional<Entry<Integer, Integer>> raceWinnerNumAndDistance;

    private EmulationService emulationService;

    @Autowired
    public RaceService(EmulationService emulationService) {
        super();
        this.emulationService = emulationService;
        this.raceHorses = emulationService.emulateRaceHorses();
    }

    public void startRace() throws InterruptedException {
        HashMap<Integer, Integer> horseNumAndDistance = new HashMap<>();

        IntStream.range(0, raceHorses.size()).forEach(i -> System.out.print(" #" + ++i + "     "));
        System.out.print("\n");
        do {
            // iteration by horses with its own paces to finish.
            for (int i = 0; i < raceHorses.size(); i++) {
                IHorse horse = raceHorses.get(i);
                int paces = emulationService.generateHorsePacesPerIterationToFinish();
                horse.setRaceSpeed(paces);
                if (horseNumAndDistance.containsKey(i)) {
                    horseNumAndDistance.put(i, horseNumAndDistance.get(i) + horse.getRaceSpeed());
                } else {
                    horseNumAndDistance.put(i, paces);
                }
                System.out.printf("%03d     ",
                        horseNumAndDistance.get(i) <= 100 ? horseNumAndDistance.get(i) : 100);
            }
            System.out.print("\n");
            raceWinnerNumAndDistance = horseNumAndDistance.entrySet().stream()
                    .filter(hd -> hd.getValue() >= 100).findFirst();
        } while (!raceWinnerNumAndDistance.isPresent());

        System.out.print("\n          FINISH\n");
    }


    public void announceWinner() {
        raceWinnerNumberActual = raceWinnerNumAndDistance.get().getKey() + 1;
        IHorse winnerHorse = raceHorses.get(raceWinnerNumberActual - 1);

        System.out.println("Winner #" + raceWinnerNumberActual + " - " + winnerHorse.getPetname()
                + " with jokey " + winnerHorse.getRaceRider().getName() + "\n\n");

        if (raceWinnerNumberUserChoice == raceWinnerNumberActual) {
            System.out.println("\n  Congrats! You won! :-)   \n");
        } else {
            System.out.println("\n  Sorry, you're not lucky this time.\n");
        }
    }

    public void offerToChooseHorse() {
        System.out.println("Please, enter a number of pair horse-jokey:");
        Scanner scanner = null;
        int choice = 0;
        boolean choiceInRange = false;
        do {
            try {
                scanner = new Scanner(System.in);
                choice = scanner.nextInt();

                if (1 <= choice && choice <= raceHorses.size()) {
                    choiceInRange = true;
                    raceWinnerNumberUserChoice = choice;
                } else {
                    System.out.println("Sorry, wrong entered number. Please, try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter Error");
            }
        } while (!choiceInRange);
        scanner.close();
    }

    public void showRaceInfo() {
        System.out.println("\n           Upcomming Race             ");
        IHorse horse;
        for (int i = 0; i < raceHorses.size(); i++) {
            horse = raceHorses.get(i);
            System.out.println("#" + (i + 1) + ": horse: " + horse.getPetname() + ", breed: "
                    + horse.getBreed().getRegestedName() + ", jokey: "
                    + horse.getRaceRider().getName());
        }
        System.out.println();
    }

}

