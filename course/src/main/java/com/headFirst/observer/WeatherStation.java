package com.headFirst.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WheaterData wheaterData = new WheaterData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(wheaterData);

        StaticDisplay staticDisplay =
                new StaticDisplay(wheaterData);

        wheaterData.setMeasurements(80, 65, 30.4f);
    }
}
