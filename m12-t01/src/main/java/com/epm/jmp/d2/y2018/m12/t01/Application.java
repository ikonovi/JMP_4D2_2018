package com.epam.jmp.d2.y2018.m12.t01;

import com.epam.jmp.d2.y2018.m12.t01.configuration.ServiceConfig;
import com.epam.jmp.d2.y2018.m12.t01.service.RaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackageClasses = {ServiceConfig.class})
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(ApplicationContext ctx) {
        return args -> {

            // Test output of logging configuration through setting appropriate Spring profile name in application properties
            logger.error("Error log - {}", "Race Emulator");
            logger.warn("Warning log - {}", "Race Emulator");
            logger.info("Info log - {}", "Race Emulator");

            RaceService raceService = (RaceService) ctx.getBean(RaceService.class);
            raceService.showRaceInfo();
            raceService.offerToChooseHorse();
            raceService.startRace();
            raceService.announceWinner();
        };
    }
}

