package com.company;

public class Main {

    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("iPhone X", "iOS", "256 GB", "Gold");
        System.out.println(iphone);
        System.out.println("\n ======================");

        Smartphone copy = (Smartphone) iphone.copy();
        System.out.println(copy);
        System.out.println("\n ======================");

        Notebook hp = new Notebook("HP", "Pavilion", "Windows 10", "512 GB SSD");
        System.out.println(hp);
        System.out.println("\n ======================");

        Notebook newCopy = (Notebook)hp.copy();
        System.out.println(newCopy);

    }
}
