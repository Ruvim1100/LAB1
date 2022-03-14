package com.company;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new XiaomiBuilder());
        Smartphone smartphone = director.BuildSmartphone();
        System.out.println(smartphone);

        director.setBuilder(new SamsungBuilder());
        smartphone = director.BuildSmartphone();
        System.out.println(smartphone);
    }
}
