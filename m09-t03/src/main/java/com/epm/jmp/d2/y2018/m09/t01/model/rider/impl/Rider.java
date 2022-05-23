package com.epm.jmp.d2.y2018.m09.t01.model.rider.impl;

import com.epm.jmp.d2.y2018.m09.t01.model.rider.IRider;

public class Rider implements IRider {

    private String name;

    public Rider(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void ride() {
        System.out.println("Riding");

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rider other = (Rider) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Rider [name=" + name + "]";
    }

}
