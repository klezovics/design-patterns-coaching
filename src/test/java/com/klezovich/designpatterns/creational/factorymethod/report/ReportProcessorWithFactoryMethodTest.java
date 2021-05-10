package com.klezovich.designpatterns.creational.factorymethod.report;

import com.klezovich.designpatterns.creational.factorymethod.report.printer.provider.JsonReportPrinterProvider;
import com.klezovich.designpatterns.creational.factorymethod.report.printer.provider.XmlReportPrinterProvider;
import org.junit.jupiter.api.Test;

//TODO: Read this https://refactoring.guru/design-patterns/factory-method
class ReportProcessorWithFactoryMethodTest {

    private Report report = new Report(1L, "Hello report");

    @Test
    void testXmlReportPrinting() {
        var printerProvider = new XmlReportPrinterProvider();
        var processor = new ReportProcessorWithFactoryMethod(printerProvider);

        processor.print(report);
    }

    @Test
    void testJsonReportPrinting() {
        var printerProvider = new JsonReportPrinterProvider();
        var processor = new ReportProcessorWithFactoryMethod(printerProvider);

        processor.print(report);
    }
}