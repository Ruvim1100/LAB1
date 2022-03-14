package com.company;

public class HpFactory implements PrinterFactory{
    @Override
    public Printer createPrinter()
    {
        return new HP();
    }
}
