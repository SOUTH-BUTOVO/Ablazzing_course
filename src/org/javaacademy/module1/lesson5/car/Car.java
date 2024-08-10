package org.javaacademy.module1.lesson5.car;

public class Car {
    private static final String ENGINE_START = "Двигатель запущен";

    // Вес машины
    private int weight = 1000;

    // Тип машины
    private final String carType;

    public Car(String carType) {
        this.carType = carType;
    }

    public Car(String carType, int weight) {
        this.carType = carType;
        this.weight = weight;
    }

    // Запуск машины
    void turnButton() {
        this.runEngine();
        this.turnLights();
    }

    // Запуск двигателя
    private void runEngine() {
        System.out.println(ENGINE_START);
    }

    // Включение фар
    private void turnLights() {
        System.out.println("Фары включены");
    }

    void prtInfoCar() {
        System.out.println(getCarType() + "\n" + "Вес машины: " + getWeight());
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", carType='" + carType + '\'' +
                '}';
    }

    public int getWeight() {
        return this.weight;
    }

    public String getCarType() {
        return "Тип машины: " + this.carType;
    }
}
