package com.company;

public class SamsungBuilder extends SmartphoneBuilder {
    @Override
    void buildModel() {
        smartphone.setModel("Samsung");
    }

    @Override
    void buildOS() {
        smartphone.setOS("Android");
    }

    @Override
    void buildStorage() {
        smartphone.setStorage("64 GB");
    }

    @Override
    void buildRam() {
        smartphone.setRam(4);
    }

    @Override
    void buildColor() {
        smartphone.setColor("White");
    }

    @Override
    void buildWeight() {
        smartphone.setWeight(250);
    }

    @Override
    void buildCamera() {
        smartphone.setCamera("18 MP");
    }
}
