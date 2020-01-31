package com.kodilla.stream.world;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {

    private final String name;
    private final List<Country> countries;

    public Continent(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countries;
    }


}
