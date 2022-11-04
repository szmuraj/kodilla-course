package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Challenge {

    @Test
    public void testProbablyWillThrowException() {
        //Given
        SecondChallenge.probablyIWillThrowException(1,0);
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When

        //Then

        assertThrows(Exception.class, () -> exceptionHandling);
    }
}
