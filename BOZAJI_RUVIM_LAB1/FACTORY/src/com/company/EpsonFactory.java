package com.company;

public class EpsonFactory implements PrinterFactory {
    @Override
     public Printer createPrinter()
    {
        return new Epson();
    }
}
