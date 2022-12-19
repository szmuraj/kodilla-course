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
        Flight flight = new Flight( flightID, dateTimeFrom, dateTimeTo, airportName, airportNameShort, airportNameTo, airportNameToShort);
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

        String city = "Gdansk";
        for(Flight e: flights) {
            if(e.airportNameFrom.equals(city)) {
                System.out.println("Flights from " + city + " start at " + e.dateTimeFrom);
            }

            if(e.airportNameTo.equals(city)) {
                System.out.println("Flights to " + city + " start at " + e.dateTimeFrom);
            }
        }
    }
}
