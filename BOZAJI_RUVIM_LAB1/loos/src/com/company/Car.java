package com.company;

public class Car {
    private String Numbers;
    private static Car Car;
    public String getNumbers(){ return Numbers; }

    private Car (String Numbers){ this.Numbers = Numbers; }

    public static Car getCar(String Numbers) {
        if (Car == null)
            Car = new Car(Numbers);
        return Car;
    }

}
