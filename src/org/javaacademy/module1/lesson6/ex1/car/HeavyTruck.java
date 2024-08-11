package org.javaacademy.module1.lesson6.ex1.car;

/** Тяжёлый грузовик */
public class HeavyTruck extends Truck {

    private int countWheels;
    public HeavyTruck(int weight, int maxSpeed, String color, int countWheels) {
        super(weight, maxSpeed, color);
        this.countWheels = countWheels;
    }
}
