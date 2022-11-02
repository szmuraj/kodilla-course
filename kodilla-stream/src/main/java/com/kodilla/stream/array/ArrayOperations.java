package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int numbers) {
        double avg=0.0;
        System.out.println(IntStream.range(0,numbers));
        return IntStream.range(0, numbers).average();
    }
}
