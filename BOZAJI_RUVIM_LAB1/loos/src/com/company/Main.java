package com.company;

public class Main {

    public static void main(String[] args) {
        Car Nissan = Car.getCar("MIM 169");
        System.out.println(Nissan.getNumbers());

        Car UAZ = Car.getCar("GAS 378");
        System.out.println(UAZ.getNumbers());

    }
}
