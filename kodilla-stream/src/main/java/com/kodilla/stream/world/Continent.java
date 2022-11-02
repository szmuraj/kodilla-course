package com.kodilla.stream.world;

import com.kodilla.stream.invoice.simple.SimpleItem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {

    static final List<Country> europe = new ArrayList<>();
    static final List<Country> northAmerica = new ArrayList<>();

    public Continent() {
        europe.add(Country.poland);
        europe.add(Country.germany);

        northAmerica.add(Country.usa);
    }


}
