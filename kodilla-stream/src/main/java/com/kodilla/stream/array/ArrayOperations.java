package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public interface ArrayOperations {

    static OptionalDouble getAverage(int numbers) {
        System.out.println(range(0,numbers));
        return IntStream.range(0,20).average();
    }
}
