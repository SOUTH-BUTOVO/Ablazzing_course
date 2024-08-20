package org.javaacademy.module1.lesson8.homework4.ex1_car_wash.car;

public class Transport {
    private boolean isClean; // чистая/грязная
    private double carLength; // Длинна машины
    private double carWidth; // Ширина машины
    private double carHeight; //Высота машины

    public Transport(boolean isClean, double carLength, double carWidth, double carHeight) {
        this.isClean = isClean;
        this.carLength = carLength;
        this.carWidth = carWidth;
        this.carHeight = carHeight;
    }

    public boolean isClean() {
        return isClean;
    }

    public double getCarLength() {
        return carLength;
    }

    public double getCarWidth() {
        return carWidth;
    }

    public double getCarHeight() {
        return carHeight;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    @Override
    public String toString() {
        return "Transport " + "чистый - " + (isClean ? "Да" : "Нет") + "\n";
    }
}
