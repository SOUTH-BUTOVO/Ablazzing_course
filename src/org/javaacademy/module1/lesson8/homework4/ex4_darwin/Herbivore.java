package org.javaacademy.module1.lesson8.homework4.ex4_darwin;

public abstract class Herbivore extends Live {
    public Herbivore(String typeName, double weight, boolean alive) {
        super(typeName, weight, alive);
    }

    protected abstract void run();
}
