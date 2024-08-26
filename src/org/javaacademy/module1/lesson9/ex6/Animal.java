package org.javaacademy.module1.lesson9.ex6;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(Animal animal);
    public abstract void sound();
    public abstract void sleep();
}
