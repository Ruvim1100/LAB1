package com.company;

public class Smartphone implements Prototype {
    String model;
    String OS;
    String storage;
    String color;

    public Smartphone(String model, String OS, String storage, String color) {
        this.model = model;
        this.OS = OS;
        this.storage = storage;
        this.color = color;
    }

    @Override
    public Object copy() {
        Smartphone copy = new Smartphone(model, OS, storage, color);
        return copy;
    }

    @Override
    public String toString() {
        return "\nSmartphone" +
                "\nmodel = " + model +
                "\nOS = " + OS +
                "\nstorage = " + storage +
                "\ncolor = " + color ;
    }

}
