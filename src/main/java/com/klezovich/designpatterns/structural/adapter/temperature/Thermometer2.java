package com.klezovich.designpatterns.structural.adapter.temperature;

public class Thermometer2 implements Thermometer {

    private final int temperatureInC;

    public Thermometer2(int temperatureInC) {
        this.temperatureInC = temperatureInC;
    }

    @Override
    public int getTemperatureInC() {
        return temperatureInC;
    }
}
