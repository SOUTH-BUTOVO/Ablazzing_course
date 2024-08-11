package org.javaacademy.module1.lesson6.ex1;

import org.javaacademy.module1.lesson6.ex1.car.LightCar;
import org.javaacademy.module1.lesson6.ex1.car.Truck;

public class Runner {
    public static void main(String[] args) {
        LightCar lightCar = new LightCar(120, 120, "Black");
        System.out.println(lightCar);
        lightCar.go();
        //lightCar.prtInfo();
        System.out.println("-----------");

        Truck truck = new Truck(10_000, 80, "White");
        System.out.println(truck);
        truck.go();
        truck.truckInfo();
        System.out.println("-----------");

    }
}
