package com.jitu.dailytarget.april25.oops.polymorphism.polymorphism2;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer pdfPrinter = new PDFPrinter();
        Printer imagePrinter = new ImagePrinter();

        printer.print();
        pdfPrinter.print();
        imagePrinter.print();
    }
}
