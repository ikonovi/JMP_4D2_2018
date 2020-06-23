package com.epm.jmp.d2.y2018.m09.t01.configuration;

import com.epm.jmp.d2.y2018.m09.t01.model.horse.IHorse;
import com.epm.jmp.d2.y2018.m09.t01.service.EmulationService;
import com.epm.jmp.d2.y2018.m09.t01.service.HorseService;
import com.epm.jmp.d2.y2018.m09.t01.service.RaceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
@ComponentScan("com.epm.jmp.d2.y2018.m09.t01.service")
@Import({HorsesConfig.class})
public class ServiceConfig {

    @Bean
    public RaceService raceService(EmulationService emulationService) {
        return new RaceService(emulationService);
    }

    @Bean
    public HorseService<IHorse> horseService(@Qualifier("engaged") List<IHorse> horses) {
        return new HorseService<IHorse>(horses);
    }

    @Bean
    public EmulationService emulationService(HorseService<IHorse> horseService) {
        return new EmulationService(horseService);
    }
}
