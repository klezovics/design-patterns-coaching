package com.klezovich.designpatterns.structural.adapter.temperature.newvendor;

import com.klezovich.designpatterns.structural.adapter.temperature.Thermometer;

//This is the adapter class
//It implements the interface we want
public class NewVendorThermometerAdapter implements Thermometer {

    //It contains within itself the adaptee
    //We are helping this thing inside to "work with" the existing code base
    private final NewVendorThermometer thermometer;

    public NewVendorThermometerAdapter(NewVendorThermometer thermometer) {
        this.thermometer = thermometer;
    }

    //Most methods in the adapter delegate to the adaptee
    @Override
    public int getTemperatureInC() {
        return thermometer.getTemperature().getValueInC();
    }
}
