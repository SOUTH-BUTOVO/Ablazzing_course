package org.javaacademy.module1.lesson6.ex2;

public abstract class Animal {

    int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    abstract void makeSound();

    void breath() {
        System.out.println("Животное дишит");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                '}';
    }
}
