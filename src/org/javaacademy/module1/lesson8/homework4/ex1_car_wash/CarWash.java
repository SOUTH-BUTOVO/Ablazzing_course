package org.javaacademy.module1.lesson8.homework4.ex1_car_wash;

import org.javaacademy.module1.lesson8.homework4.ex1_car_wash.car.Transport;

public class CarWash {

    public static int wash(Transport[] transports) {
        int totalPriceWash = 0;
        for (Transport transport : transports) {
            if (!transport.isClean()) {
                System.out.println("Производим мойку ");
                if (transport.getCarLength() > 6 ||
                    transport.getCarWidth() > 2 ||
                    transport.getCarHeight() > 2.5) {
                    System.out.println("крупного транспорта.");
                    System.out.println("Стоимость мойки 4000 рублей.");
                    totalPriceWash += 4000;
                    transport.setClean(true);
                    System.out.println("---------------");
                } else {
                    System.out.println("маломерного транспорта.");
                    System.out.println("Стоимость мойки 2000 рублей.");
                    totalPriceWash += 2000;
                    transport.setClean(true);
                    System.out.println("---------------");
                }
            }
        }
        return totalPriceWash;
    }
}
