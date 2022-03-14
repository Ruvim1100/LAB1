package com.company;

public class XiaomiBuilder extends SmartphoneBuilder{
    @Override
    void buildModel() {
        smartphone.setModel("Xiaomi");
    }

    @Override
    void buildOS() {
        smartphone.setOS("Android");
    }

    @Override
    void buildStorage() {
        smartphone.setStorage("128 GB");
    }

    @Override
    void buildRam() {
        smartphone.setRam(3);
    }

    @Override
    void buildColor() {
        smartphone.setColor("Black");
    }

    @Override
    void buildWeight() {
        smartphone.setWeight(220);
    }

    @Override
    void buildCamera() {
        smartphone.setCamera("20 MP");
    }
}
