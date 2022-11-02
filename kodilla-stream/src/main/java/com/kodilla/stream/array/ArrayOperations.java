package com.kodilla.stream.array;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public interface ArrayOperations {

    static double getAverage(int numbers) {
        double avg=0.0;
        System.out.println(range(0,numbers));
        double IntStream.range(0, numbers).average();
    }
}
