package org.javaacademy.module1.lesson8.homework4.ex1_car_wash.car;

public class Bus extends Transport {
    private final int maxNumberOfPassengers; // макс кол-во пассажиров

    public Bus(boolean isClean, double carLength, double carWidth,
                                double carHeight, int maxNumberOfPassengers) {
        super(isClean, carLength, carWidth, carHeight);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }
}
