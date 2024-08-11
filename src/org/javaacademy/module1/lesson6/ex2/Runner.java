package org.javaacademy.module1.lesson6.ex2;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat(10);
        Dog dog = new Dog(15);
        //Animal animal = new Animal();
        cat.makeSound();
        dog.makeSound();
        System.out.println("---");

        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.makeSound();
            animal.breath();
        }
        System.out.println("---");

        System.out.println(cat);
        System.out.println(dog);
    }
}
