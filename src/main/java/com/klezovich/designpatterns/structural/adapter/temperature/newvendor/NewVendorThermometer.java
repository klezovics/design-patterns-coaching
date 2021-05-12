package com.klezovich.designpatterns.structural.adapter.temperature.newvendor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NewVendorThermometer {

    private Temperature temperature;

    public Temperature getTemperatureInC() {
        return temperature;
    }
}
