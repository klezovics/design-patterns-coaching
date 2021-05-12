package com.klezovich.designpatterns.structural.adapter.temperature;

import java.util.List;

public class TemperatureMeasurementProcessor {

    int getAverageTemperatureInC(List<Thermometer> thermometerList) {
        int total = 0;
        for(var thermomemeter : thermometerList) {
            total+=thermomemeter.getTemperatureInC();
        }

        return (total/thermometerList.size());
    }
}
