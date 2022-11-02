package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetSandBeansQuantity() {
        //Given
        List<List<Country>> earth = new ArrayList<List<Country>>();

        //When
        BigDecimal peoplePopulation = BigDecimal.ZERO;
        for (List<Country> world : earth) {
            for(Country continent : world) peoplePopulation = peoplePopulation.add(continent.getPeopleQuantity());
        }

        //Then
        BigDecimal expected = new BigDecimal("211111110903703703670");
        assertEquals(expected, peoplePopulation);
    }
}
