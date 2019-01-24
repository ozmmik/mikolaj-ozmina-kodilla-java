package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, String peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = new BigDecimal(peopleQuantity);
    }

    public BigDecimal getPeopleQunatity(){
        return peopleQuantity;
    }

}
