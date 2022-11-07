package com.kodilla.exception.test;

import java.util.Map;
import java.util.Optional;

public class RouteNotFoundException extends Exception {
    public static void main(String[] args) throws RouteNotFoundException {
        String flight = "Warsaw Chopin Airport";
        String x = "Modlin";

        Optional<Boolean> optionalFlight = Optional.ofNullable(Flight.findFilght(x));
        optionalFlight.ifPresent(System.out::println);


    }
}
