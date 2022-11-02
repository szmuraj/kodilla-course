package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given;
        World world = new World();

        //When
        BigDecimal peoplePopulation = BigDecimal.ZERO;
        for (List<Country> continents : world.getEarth())
            for (Country country : continents) peoplePopulation = peoplePopulation.add(country.getPeopleQuantity());

        //Then
        BigDecimal expected = new BigDecimal("211111110903703703670");
        assertEquals(expected, peoplePopulation);
    }
}
