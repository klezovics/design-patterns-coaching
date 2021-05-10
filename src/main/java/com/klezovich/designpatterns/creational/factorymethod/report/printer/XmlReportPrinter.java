package com.klezovich.designpatterns.creational.factorymethod.report.printer;

import com.klezovich.designpatterns.creational.factorymethod.report.Report;
import com.klezovich.designpatterns.creational.factorymethod.report.printer.ReportPrinter;

public class XmlReportPrinter implements ReportPrinter {

    @Override
    public void print(Report r) {
        System.out.println("<report>");
        System.out.println("<id>"+r.getId()+"</id>");
        System.out.println("<name>"+r.getName()+"</name>");
        System.out.println("</report>");
    }
}
