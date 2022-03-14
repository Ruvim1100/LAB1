package com.company;

public class Smartphone {
    String model;
    String OS;
    String storage;
    int ram;
    String color;
    int weight;
    String camera;

    public void setModel(String model) {
        this.model = model;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return " \nSmartphone:" +
                "\n model=" + model +
                ", \n OS=" + OS +
                ", \n storage=" + storage +
                ", \n ram=" + ram +
                ", \n color=" + color +
                ", \n weight=" + weight +
                ", \n camera=" + camera ;
    }

}
