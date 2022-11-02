package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        double actual = ArrayOperations.getAverage(20);


        //When
        double avg = 0.0;
        for (int i = 0; i < 20; i++) {
            avg += i;
        }
        avg = avg/20;

        //Then
        Assertions.assertEquals(avg, actual);
    }
}
