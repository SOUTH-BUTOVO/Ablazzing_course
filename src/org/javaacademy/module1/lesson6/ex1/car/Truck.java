package org.javaacademy.module1.lesson6.ex1.car;

/** Грузовая машина*/

public class Truck extends Car {

    public Truck(int weight, int maxSpeed, String color) {
        super(weight, maxSpeed, color);
    }

    public void truckInfo() {
        super.getInfo();
    }
}
