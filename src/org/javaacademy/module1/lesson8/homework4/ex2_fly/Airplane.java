package org.javaacademy.module1.lesson8.homework4.ex2_fly;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("пассажиров в самолете меньше 0");
        }
        System.out.print("Самолёт ");
        Flyable.super.fly();
    }
}
