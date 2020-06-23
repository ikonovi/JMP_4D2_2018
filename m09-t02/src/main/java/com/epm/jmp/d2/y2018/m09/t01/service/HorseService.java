package com.epm.jmp.d2.y2018.m09.t01.service;

import com.epm.jmp.d2.y2018.m09.t01.model.IHorse;
import com.epm.jmp.d2.y2018.m09.t01.model.IRider;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service for horse management (horses with their riders, breeds and other characteristics should be obtained from the
 * configuration)
 *
 *
 */
public class HorseService<H extends IHorse> {

    private List<H> horses;

    @Autowired
    public HorseService(List<H> horses) {
        super();
        this.horses = horses;
    }

    public List<H> getHorses() {
        return horses;
    }

    public List<IRider> getHorseRiders() {
        return horses.parallelStream().map(H::getRaceRider).collect(Collectors.toList());
    }

    public void runHorses() {

    }

}
