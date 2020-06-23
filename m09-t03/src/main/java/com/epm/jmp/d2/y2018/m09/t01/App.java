package com.epm.jmp.d2.y2018.m09.t01;

import com.epm.jmp.d2.y2018.m09.t01.configuration.ServiceConfig;
import com.epm.jmp.d2.y2018.m09.t01.service.RaceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class App {



    public static void main(String[] args) throws IOException, InterruptedException {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ServiceConfig.class);
        ctx.refresh();

        RaceService raceService = (RaceService) ctx.getBean(RaceService.class);

        raceService.showRaceInfo();
        raceService.offerToChooseHorse();
        raceService.startRace();
        raceService.announceWinner();

        ctx.close();
    }
}
