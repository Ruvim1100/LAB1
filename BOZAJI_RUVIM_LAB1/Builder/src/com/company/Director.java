package com.company;

public class Director {
    SmartphoneBuilder builder;
    void setBuilder(SmartphoneBuilder b){
        builder = b;
    }

    Smartphone BuildSmartphone(){
        builder.createSmartphone();
        builder.buildModel();
        builder.buildOS();
        builder.buildStorage();
        builder.buildRam();
        builder.buildColor();
        builder.buildWeight();
        builder.buildCamera();

        Smartphone smartphone = builder.getSmartphone();
        return smartphone;
    }

}
