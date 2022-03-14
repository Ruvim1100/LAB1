package com.company;

public class Notebook implements Prototype{
    String manufacturer;
    String model;
    String OS;
    String storage;

    public Notebook(String manufacturer, String model, String OS, String storage) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.OS = OS;
        this.storage = storage;
    }

    @Override
    public Object copy() {
        Notebook copy = new Notebook(manufacturer, model, OS, storage);
        return copy;
    }

    @Override
    public String toString() {
        return "\nNotebook" +
                "\nmanufacturer = " + manufacturer +
                "\nmodel = " + model +
                "\nOS = " + OS +
                "\nstorage = " + storage ;
    }
}
