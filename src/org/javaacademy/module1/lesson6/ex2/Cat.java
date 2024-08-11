package org.javaacademy.module1.lesson6.ex2;

public class Cat extends Animal {

    public Cat(int weight) {
        super(weight);
    }

    @Override
    void makeSound() {
        System.out.println("Мяу");
    }
}
