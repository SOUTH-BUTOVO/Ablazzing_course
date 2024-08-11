package org.javaacademy.module1.lesson6.ex2;

public class Dog extends Animal {

    public Dog(int weight) {
        super(weight);
    }

    @Override
    void makeSound() {
        System.out.println("Гав");
    }

    @Override
    void breath() {
        System.out.println("Собака дышит");
    }

    @Override
    public String toString() {
        return "Это собака с весом: " + this.weight;
    }
}
