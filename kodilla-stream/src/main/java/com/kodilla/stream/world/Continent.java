package com.kodilla.stream.world;


import java.util.List;

public class Continent {
    private final String continentName;
    private List<Country> country;

    public Continent(String continentName, List<Country> country) {
        this.continentName = continentName;
        this.country = country;
    }

    public List<Country> getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return continentName.hashCode();
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                '}';
    }
}
