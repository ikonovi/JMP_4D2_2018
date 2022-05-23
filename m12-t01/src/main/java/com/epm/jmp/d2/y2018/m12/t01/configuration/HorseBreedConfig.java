package com.epm.jmp.d2.y2018.m12.t01.configuration;

import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.Breed;
import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.impl.BlazerHorseBreed;
import com.epm.jmp.d2.y2018.m12.t01.model.horse.breed.impl.HorseBreedType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.epm.jmp.d2.y2018.m12.t01.model.horse.breed"})
@PropertySource("classpath:horse-breeds.properties")
public class HorseBreedConfig {

    @Bean
    public Breed blazerHorseBreed(@Value("${BlazerHorseBreed.name}") String breedName,
            @Value("false") boolean isColored) {
        Breed breed = new BlazerHorseBreed(breedName);
        breed.setBreedType(HorseBreedType.HEAVY);
        breed.setColored(isColored);
        return breed;
    }

    @Bean
    public Breed kazakhHorseBreed(@Value("${KazakhHorseBreed.name}") String breedName,
            @Value("false") boolean isColored) {
        Breed breed = new BlazerHorseBreed(breedName);
        breed.setBreedType(HorseBreedType.SADDLE);
        breed.setColored(isColored);
        return breed;
    }

    @Bean
    public Breed mustangHorseBreed(@Value("${MustangHorseBreed.name}") String breedName,
            @Value("true") boolean isColored) {
        Breed breed = new BlazerHorseBreed(breedName);
        breed.setBreedType(HorseBreedType.SPORT);
        breed.setColored(isColored);
        return breed;
    }

    @Bean
    public Breed rockyMountainHorseBreed(@Value("${RockyMountainHorseBreed.name}") String breedName,
            @Value("true") boolean isColored) {
        Breed breed = new BlazerHorseBreed(breedName);
        breed.setBreedType(HorseBreedType.SPORT);
        breed.setColored(isColored);
        return breed;
    }
}
