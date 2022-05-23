package com.epm.jmp.d2.y2018.m09.t01;

import com.epm.jmp.d2.y2018.m09.t01.service.RaceService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {

        ConfigurableApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-context-all.xml");

        RaceService raceService = (RaceService) ctx.getBean(RaceService.class);

        raceService.showRaceInfo();
        raceService.offerToChooseHorse();
        raceService.startRace();
        raceService.announceWinner();

        ctx.close();
    }


}