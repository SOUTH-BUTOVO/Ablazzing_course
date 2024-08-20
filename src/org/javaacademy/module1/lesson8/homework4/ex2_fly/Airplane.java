package org.javaacademy.module1.lesson8.homework4.ex2_fly;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("количество пассажиров: " + getCountPassengers());
        }
        System.out.println("Самолёт ");
        Flyable.super.fly();
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
