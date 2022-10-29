package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {
    public Temperatures temperatures;
    Map<String, Double> resultMap = new HashMap<>();
    public static Double avarageTemp;
    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double avarageTemp() {
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            avarageTemp += temperature.getValue();
        }

        return avarageTemp / resultMap.size();
    }

    public Double medianaTemp() {
        Double mediana = 0.0;
        List<Double> resultList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultList.add(temperature.getValue());
        }
        Collections.sort(resultList);

        if (resultList.size() % 2 == 0 ) {
            mediana = (resultList.get(resultList.size()/2) + resultList.get((resultList.size()/2)-1))/2;
        } else {
            mediana = resultList.get(resultList.size() / 2);
        }
        return mediana;
    }
}