package com.kodilla.stream.world;


import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final Set<Country> continent = new HashSet<>();

    public Set<Country> getContinent(){
        return new HashSet<>(continent);
    }
}
