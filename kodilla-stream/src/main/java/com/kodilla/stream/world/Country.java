package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
    public String getCountryName() {
        return countryName;
    }

    static Country poland = new Country("Poland", new BigDecimal("38500000"));
    static Country germany = new Country("Germany", new BigDecimal("82000000"));
    static Country usa = new Country("USA", new BigDecimal("325000000"));

}
