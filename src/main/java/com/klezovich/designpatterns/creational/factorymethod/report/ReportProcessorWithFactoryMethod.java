package com.klezovich.designpatterns.creational.factorymethod.report;

import com.klezovich.designpatterns.creational.factorymethod.report.printer.provider.ReportPrinterProvider;

public class ReportProcessorWithFactoryMethod {

    private ReportPrinterProvider printerProvider;

    public ReportProcessorWithFactoryMethod(ReportPrinterProvider printerProvider) {
        this.printerProvider = printerProvider;
    }

    public void print(Report r) {
        //If we could reuse a single printer instance, better to inject it into the class
        //Rather then create a factory
        var printer = printerProvider.getPrinter();
        printer.print(r);
    }

    //Many other methods
}
