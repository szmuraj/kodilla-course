package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.world.Continent.europe;
import static com.kodilla.stream.world.Continent.northAmerica;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given;
        List<List<Country>> earth = new ArrayList<>();
        earth.add(europe);
        earth.add(northAmerica);
        europe.add(Country.poland);
        europe.add(Country.germany);
        northAmerica.add(Country.usa);

        //When
        BigDecimal peoplePopulation = BigDecimal.ZERO;
        for (List<Country> continents : earth)
            for (Country country : continents) peoplePopulation = peoplePopulation.add(country.getPeopleQuantity());

        //Then
        BigDecimal expected = new BigDecimal("445500000");
        assertEquals(expected, peoplePopulation);
    }
}
