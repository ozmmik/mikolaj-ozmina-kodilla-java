package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class World {

    private List<Continent> continents = new ArrayList<>();


    public BigDecimal getPeopleQunatity() {
        return continents.stream()
                .flatMap(people -> people.getCountry().stream())
                .map(Country::getPeopleQunatity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return continents.equals(world.continents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continents);
    }
}
