package com.company;

public class Main {

    public static void main(String[] args) {
        PrinterFactory printerfactory =  getFactoryByName("Epson");
        Printer printer = printerfactory.createPrinter();
        printer.print();


    }
    public static PrinterFactory getFactoryByName(String factory){
        if(factory.equals("Epson"))
            return new EpsonFactory();
        else if(factory.equals("HP"))
            return new HpFactory();
        throw new RuntimeException("Нет такого производителя " + factory);
    }

}
