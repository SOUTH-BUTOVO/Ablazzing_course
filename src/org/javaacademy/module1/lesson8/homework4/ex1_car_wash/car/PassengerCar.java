package org.javaacademy.module1.lesson8.homework4.ex1_car_wash.car;

public class PassengerCar extends Transport {
    private final boolean isCruiseControl; // круиз контроль

    public PassengerCar(boolean isClean, double carLength, double carWidth,
                                         double carHeight, boolean isCruiseControl) {
        super(isClean, carLength, carWidth, carHeight);
        this.isCruiseControl = isCruiseControl;
    }
}
