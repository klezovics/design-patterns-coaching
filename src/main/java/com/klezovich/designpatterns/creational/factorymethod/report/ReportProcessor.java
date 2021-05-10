package com.klezovich.designpatterns.creational.factorymethod.report;

import com.klezovich.designpatterns.creational.factorymethod.report.printer.ReportPrinter;

public class ReportProcessor {

    //OK, so we hide the concrete printer implementation behind an interface
    //Works OK if we can reuse the printer ...
    //But what if we need to create a new printer each time ??
    //For example, the printer gets reconfigured each time based on the report parameters
    private ReportPrinter printer;

    public ReportProcessor(ReportPrinter printer) {
        this.printer = printer;
    }

    public void print(Report r) {
        printer.print(r);
    }

    //Many other methods
}
