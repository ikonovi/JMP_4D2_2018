package com.epm.jmp.d2.y2018.m12.t01.configuration;

import com.epm.jmp.d2.y2018.m12.t01.model.rider.IRider;
import com.epm.jmp.d2.y2018.m12.t01.model.rider.impl.Rider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.epm.jmp.d2.y2018.m12.t01.model.rider"})
public class JokeyConfig {

    @Bean
    public IRider jokey01(@Value("Vasia") String name) {
        return new Rider(name);
    }

    @Bean
    public IRider jokey02(@Value("Sema") String name) {
        return new Rider(name);
    }

    @Bean
    public IRider jokey03(@Value("Petia") String name) {
        return new Rider(name);
    }

    @Bean
    public IRider jokey04(@Value("Kolia") String name) {
        return new Rider(name);
    }

    @Bean
    public IRider jokey05(@Value("Olga") String name) {
        return new Rider(name);
    }
}
