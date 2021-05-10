package com.klezovich.designpatterns.creational.factorymethod.report.printer;

import com.klezovich.designpatterns.creational.factorymethod.report.Report;

public class JsonReportPrinter implements ReportPrinter {

    @Override
    public void print(Report r) {
        System.out.println("{");
        System.out.println("\"id\":" + r.getId() + ",");
        System.out.println("\"name\":" + r.getName());
        System.out.println("}");
    }
}
