package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import com.kodilla.exception.test.Flight;

public class FlightLogic extends RouteNotFoundException{
    public static void main(String[] args) throws RouteNotFoundException {
        public static void findFilght(Flight flight) {
            Map<String, Boolean> airports = new HashMap<>();
            if (airports.get(flight)) {
                throw RouteNotFoundException;
            } catch (RouteNotFoundException e) {
                System.out.println("There is no Airport with this name");
            }
        }
    }
}
