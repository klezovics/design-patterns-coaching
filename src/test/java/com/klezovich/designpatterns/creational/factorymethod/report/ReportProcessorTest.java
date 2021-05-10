package com.klezovich.designpatterns.creational.factorymethod.report;

import com.klezovich.designpatterns.creational.factorymethod.report.printer.JsonReportPrinter;
import com.klezovich.designpatterns.creational.factorymethod.report.printer.XmlReportPrinter;
import org.junit.jupiter.api.Test;

class ReportProcessorTest {

    private Report report = new Report(1L, "Hello report");

    @Test
    void testXmlReportPrinting() {
        var printer = new XmlReportPrinter();
        var processor = new ReportProcessor(printer);

        processor.print(report);
    }

    @Test
    void testJsonReportPrinting() {
        var printer = new JsonReportPrinter();
        var processor = new ReportProcessor(printer);

        processor.print(report);
    }
}