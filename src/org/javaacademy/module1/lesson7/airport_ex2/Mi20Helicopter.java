package org.javaacademy.module1.lesson7.airport_ex2;

public class Mi20Helicopter extends Helicopter {

    public void catapultPilot() {
        System.out.println("Катапультируем пилота");
    }

    @Override
    public void fly() {
        System.out.println("Вертолёт Ми20 летит");
    }
}
