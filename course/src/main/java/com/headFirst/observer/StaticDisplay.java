package com.headFirst.observer;

public class StaticDisplay implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private final Observable wheaterData;

    public StaticDisplay(Observable wheaterData) {
        this.wheaterData = wheaterData;
        wheaterData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Static conditions: " + temperature
                + "F degreed and " + humidity + "% humidity"
                + pressure + " pressure");
    }
}
