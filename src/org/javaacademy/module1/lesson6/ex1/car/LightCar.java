package org.javaacademy.module1.lesson6.ex1.car;

public class LightCar extends Car {

    /** Легковая машина */
    public LightCar(int weight, int maxSpeed, String color) {
        super(weight, maxSpeed, color);
    }

    public LightCar() {
        super(100, 100, "Orange");

    }

    void prtInfo() {
        System.out.println("Вес машины: " + this.weight);
    }
}
