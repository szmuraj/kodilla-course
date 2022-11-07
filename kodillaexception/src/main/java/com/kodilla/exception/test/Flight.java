package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flight extends RouteNotFoundException{
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public static Boolean findFilght(String flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw Chopin Airport", true);
        return airports.get(flight);
    }
}
