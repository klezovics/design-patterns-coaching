package com.klezovich.designpatterns.creational.factorymethod.report.printer.provider;

import com.klezovich.designpatterns.creational.factorymethod.report.printer.ReportPrinter;
import com.klezovich.designpatterns.creational.factorymethod.report.printer.XmlReportPrinter;

public class XmlReportPrinterProvider implements ReportPrinterProvider {

    //This a concrete implementation of a factory method
    //Returns a concrete implementation of an interface
    @Override
    public ReportPrinter getPrinter() {
        return new XmlReportPrinter();
    }
}
