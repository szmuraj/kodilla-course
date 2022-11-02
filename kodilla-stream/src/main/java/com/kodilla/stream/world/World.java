package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodilla.stream.world.Continent.europe;
import static com.kodilla.stream.world.Continent.northAmerica;

public final class World {

    private final List<List<Country>> earth = new ArrayList<List<Country>>();
    private final List<List<Country>> mars = new ArrayList<>();

    public World() {
        earth.add(europe);
        earth.add(northAmerica);
    }

    public List<List<Country>> getEarth() {
        return earth;
    }

    public List<List<Country>> getMars() {
        return mars;
    }

    public BigDecimal getPeopleQuantity() {
        return earth.stream()
                .flatMap(countries -> countries.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
