package com.klezovich.designpatterns.creational.factorymethod.report.printer.provider;

import com.klezovich.designpatterns.creational.factorymethod.report.printer.ReportPrinter;

public interface ReportPrinterProvider {

    //This is the factory method
    //It creates an instance of an INTERFACE
    ReportPrinter getPrinter();
}
