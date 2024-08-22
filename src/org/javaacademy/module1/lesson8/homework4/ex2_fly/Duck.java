package org.javaacademy.module1.lesson8.homework4.ex2_fly;

public class Duck implements Flyable {
    private boolean isInjured = false;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Уточка ранена");
        }
        System.out.print("Уточка ");
        Flyable.super.fly();
    }
}
