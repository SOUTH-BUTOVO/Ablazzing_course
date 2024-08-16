package org.javaacademy.module1.lesson7.airport_ex2;

public class Airplane implements Flyable {
    private int enginePower;

    public Airplane(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void fly() {
        if (enginePower > 0) {
            System.out.println("Самолёт летит");
        } else {
            System.out.println("Самолёт НЕ летит");
        }
    }

    @Override
    public String toString() {
        return "Airplane{" + "enginePower=" + enginePower + '}';
    }

    @Override
    public void landing() {
        System.out.println("Самолёт приземлился " + Flyable.count);
    }
}
