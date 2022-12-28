package com.kodilla.good.patterns.fly;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private final int flightID;
    private final LocalDateTime dateTimeFrom;
    private final LocalDateTime dateTimeTo;
    private final String airportNameFrom;
    private final String airportNameFromShort;
    private final String airportNameTo;
    private final String airportNameToShort;
    static List<Flight> flights = new ArrayList<>();

    public Flight(int flightID, LocalDateTime dateTimeFrom, LocalDateTime dateTimeTo, String airportNameFrom, String airportNameFromShort, String airportNameTo, String airportNameToShort) {
        this.flightID = flightID;
        this.dateTimeFrom = dateTimeFrom;
        this.dateTimeTo = dateTimeTo;
        this.airportNameFrom = airportNameFrom;
        this.airportNameFromShort = airportNameFromShort;
        this.airportNameTo = airportNameTo;
        this.airportNameToShort = airportNameToShort;
    }

    public static void setFlight(int flightID, LocalDateTime dateTimeFrom, LocalDateTime dateTimeTo, String airportName, String airportNameShort, String airportNameTo, String airportNameToShort) {
        Flight flight = new Flight(flightID, dateTimeFrom, dateTimeTo, airportName, airportNameShort, airportNameTo, airportNameToShort);
        flights.add(flight);
    }

    public static void main(String[] args) {
        Flight.setFlight(111,
                LocalDateTime.of(2021, 4, 24, 14, 33),
                LocalDateTime.of(2021, 4, 24, 16, 45),
                "Warsaw",
                "WAW",
                "Gdansk",
                "GDA");

        Flight.setFlight(222,
                LocalDateTime.of(2021, 5, 24, 14, 33),
                LocalDateTime.of(2021, 5, 24, 16, 45),
                "Gdansk",
                "GDA",
                "Wroclaw",
                "WRO");

        Flight.setFlight(333,
                LocalDateTime.of(2021, 6, 24, 14, 33),
                LocalDateTime.of(2021, 6, 24, 16, 45),
                "Wroclaw",
                "WRO",
                "Gdansk",
                "GDA");

        String cityFrom = "Warsaw";
        String cityBetween = "Gdansk";
        String cityTo = "Wroclaw";

        for (Flight e : flights) {
            if (e.airportNameFrom.equals(cityFrom)) {
                System.out.println("Flights from " + cityFrom + " start at " + e.dateTimeFrom);
            }

            if (e.airportNameTo.equals(cityTo)) {
                System.out.println("Flights to " + cityFrom + " start at " + e.dateTimeTo);
            }

            if (e.airportNameFrom.equals(cityFrom) && e.airportNameTo.equals(cityTo)) {
                System.out.println("Flights from " + cityFrom + " start at " + e.dateTimeFrom + " and land at " + cityTo + " at " + e.dateTimeTo);
            }

            if (e.airportNameFrom.equals(cityFrom) && e.airportNameTo.equals(cityBetween)) {
                for (Flight f : flights) {
                    if (f.airportNameFrom.equals(cityBetween) && f.airportNameTo.equals(cityTo)) {
                        System.out.println("Flight form " + cityFrom + " to " + cityTo + " landing at " + cityBetween + " start at " + e.dateTimeFrom);
                    }
                }
            }
        }
    }
}

