package org.javaacademy.module1.lesson8.ex1;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(0);
        try {
            car.go();
            System.out.println("Ура! На море едем на машине!!!");
        } catch (Exception e) {
            System.out.println("С машиной что то не так, едем на море на поезде. " + e.getMessage());
        }
    }
}
