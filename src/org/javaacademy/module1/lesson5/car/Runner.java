package org.javaacademy.module1.lesson5.car;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car("Легковая", 1_200);
        Car car2 = new Car("Грузовая");
        car1.turnButton();
        System.out.println("--------------------");

        System.out.println("Вес машины: " + car1.getWeight());
        System.out.println("Вес машины: " + car2.getWeight());
        System.out.println("--------------------");

        //System.out.println("Тип машины: " + car1.getCarType());
        //System.out.println("Тип машины: " + car2.getCarType());
        car1.prtInfoCar();
        car2.prtInfoCar();
        System.out.println("--------------------");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println("--------------------");

//        final int number = 10;
//        number += 1;
//        System.out.println(number);
    }
}
