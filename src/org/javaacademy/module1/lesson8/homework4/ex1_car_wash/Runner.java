package org.javaacademy.module1.lesson8.homework4.ex1_car_wash;

import org.javaacademy.module1.lesson8.homework4.ex1_car_wash.car.Bus;
import org.javaacademy.module1.lesson8.homework4.ex1_car_wash.car.PassengerCar;
import org.javaacademy.module1.lesson8.homework4.ex1_car_wash.car.Transport;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        PassengerCar passengerCar1 = new PassengerCar(false, 5, 2,
                                                          1.8, true);
        PassengerCar passengerCar2 = new PassengerCar(false, 5, 2,
                                                          1.8, false);
        PassengerCar passengerCar3 = new PassengerCar(false, 5, 2,
                                                          1.8, true);
        PassengerCar passengerCar4 = new PassengerCar(true, 5, 2,
                                                          1.8, false);

        Bus bus1 = new Bus(false, 12, 3, 2.3, 20);
        Bus bus2 = new Bus(false, 12, 3, 2.3, 40);
        Bus bus3 = new Bus(false, 12, 3, 2.3, 60);
        Bus bus4 = new Bus(false, 12, 3, 2.3, 60);
        Bus bus5 = new Bus(true, 12, 3, 2.3, 120);

        Transport[] transports = {passengerCar1, passengerCar2, passengerCar3, passengerCar4,
                                  bus1, bus2, bus3, bus4, bus5};

        // 26_000 руб. если весь транспорт грязный.
        System.out.println("Итоговая стоимость мойки: " + CarWash.wash(transports) + " рублей.");
        System.out.println(Arrays.toString(transports));
    }
}
