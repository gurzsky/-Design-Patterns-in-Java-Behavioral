package com.headFirst.observer;

public class CurrentConditionsDisplay implements Observer {

    private final Observable wheaterData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable wheaterData) {
        this.wheaterData = wheaterData;
        wheaterData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degreed and " + humidity + "% humidity");
    }
}
