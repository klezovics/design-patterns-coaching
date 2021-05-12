package com.klezovich.designpatterns.structural.adapter.temperature;

import com.klezovich.designpatterns.structural.adapter.temperature.newvendor.NewVendorThermometer;
import com.klezovich.designpatterns.structural.adapter.temperature.newvendor.NewVendorThermometerAdapter;
import com.klezovich.designpatterns.structural.adapter.temperature.newvendor.Temperature;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureMeasurementProcessorTest {

    private TemperatureMeasurementProcessor processor = new TemperatureMeasurementProcessor();

    @Test
    void testCanComputeAverageTemperatureCorrectly() {
        var t1 = new Thermometer1(10);
        var t2 = new Thermometer2(30);

        //All thermometers we have implement the desired interface
        //Yay !
        var tList = List.of(t1,t2);
        assertEquals(20, processor.getAverageTemperatureInC(tList));
    }


    @Test
    void testCanComputeAverageTemperatureCorrectlyWithThermometerFromNewVendor() {
        var t1 = new Thermometer1(10);
        var t2 = new Thermometer2(30);

        //Oh wow, does not implement expected interface for a thermometer
        var t3 = new NewVendorThermometer( new Temperature(20));

        //Not a problem, let's use an adapter
        var tList = List.of(t1,t2, new NewVendorThermometerAdapter(t3));
        assertEquals(20, processor.getAverageTemperatureInC(tList));
    }

}