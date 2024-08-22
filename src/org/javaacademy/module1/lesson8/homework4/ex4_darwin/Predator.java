package org.javaacademy.module1.lesson8.homework4.ex4_darwin;

public abstract class Predator extends Live {

    public Predator(String typeName, double weight, boolean alive) {
        super(typeName, weight, alive);
    }

    protected abstract void attack(Live[] animal);
}
