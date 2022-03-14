package com.company;

public abstract class SmartphoneBuilder {
    Smartphone smartphone;

    public void createSmartphone(){
        smartphone = new Smartphone();
    }

    abstract void buildModel();
    abstract void buildOS();
    abstract void buildStorage();
    abstract void buildRam();
    abstract void buildColor();
    abstract void buildWeight();
    abstract void buildCamera();

    Smartphone getSmartphone(){

        return smartphone;
    }

}
