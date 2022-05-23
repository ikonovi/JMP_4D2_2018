package com.epm.jmp.d2.y2018.m12.t01.configuration;

import com.epm.jmp.d2.y2018.m12.t01.model.horse.IHorse;
import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.Breed;
import com.epm.jmp.d2.y2018.m12.t01.model.horse.impl.Horse;
import com.epm.jmp.d2.y2018.m12.t01.model.rider.IRider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;

@Configuration
@Import({JokeyConfig.class, HorseBreedConfig.class})
@ComponentScan(basePackages = {"com.epm.jmp.d2.y2018.m12.t01.model.horse"})
public class HorsesConfig {

    @Bean
    @Order(1)
    @Qualifier("engaged")
    public IHorse horse01(@Value("Marta") String petname,
            @Qualifier("blazerHorseBreed") Breed breed, @Qualifier("jokey01") IRider rider) {
        IHorse h = new Horse(petname, breed);
        h.setRaceRider(rider);
        return h;
    }

    @Bean
    @Order(2)
    @Qualifier("engaged")
    public IHorse horse02(@Value("Kosel") String petname,
            @Qualifier("kazakhHorseBreed") Breed breed, @Qualifier("jokey02") IRider rider) {
        IHorse h = new Horse(petname, breed);
        h.setRaceRider(rider);
        return h;
    }

    @Bean
    @Order(3)
    @Qualifier("engaged")
    public IHorse horse03(@Value("Marta") String petname,
            @Qualifier("mustangHorseBreed") Breed breed, @Qualifier("jokey03") IRider rider) {
        IHorse h = new Horse(petname, breed);
        h.setRaceRider(rider);
        return h;
    }

    @Bean
    @Order(4)
    @Qualifier("engaged")
    public IHorse horse04(@Value("Marta") String petname,
            @Qualifier("rockyMountainHorseBreed") Breed breed, @Qualifier("jokey04") IRider rider) {
        IHorse h = new Horse(petname, breed);
        h.setRaceRider(rider);
        return h;
    }

    @Bean
    @Order(5)
    @Qualifier("engaged")
    public IHorse horse05(@Value("Marta") String petname,
            @Qualifier("kazakhHorseBreed") Breed breed, @Qualifier("jokey05") IRider rider) {
        IHorse h = new Horse(petname, breed);
        h.setRaceRider(rider);
        return h;
    }
}
