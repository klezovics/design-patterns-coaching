package com.klezovich.designpatterns.structural.adapter.temperature;

public class Thermometer1 implements Thermometer {

    private final int temperatureInC;

    public Thermometer1(int temperatureInC) {
        this.temperatureInC = temperatureInC;
    }

    @Override
    public int getTemperatureInC() {
        return temperatureInC;
    }
}
