package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        List<Country> countryOfEurope = new ArrayList<>();
        countryOfEurope.add(new Country("Poland", "10000000000"));
        countryOfEurope.add(new Country("Germany", "20000000000"));

        List<Country> countryOfAsia = new ArrayList<>();
        countryOfAsia.add(new Country("Japan", "30000000000"));
        countryOfAsia.add(new Country("China", "40000000000"));

        //When
        Continent europe = new Continent("Europe", countryOfEurope);
        Continent asia = new Continent("Asia", countryOfAsia);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);


        //Then
        BigDecimal expectedQPeopleQuantity = new BigDecimal("100000000000");
        Assert.assertEquals(expectedQPeopleQuantity, world.getPeopleQunatity());
    }
}
