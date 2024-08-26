package org.javaacademy.module1.lesson9.ex6;

public class Runner {
    public static void main(String[] args) {
        Animal tiger = new Animal("Тигр") {
            @Override
            public void run(Animal animal) {
                System.out.println("Тигр бежит за " + animal.name);
            }

            @Override
            public void sound() {
                System.out.println("Тигр рычит");
            }

            @Override
            public void sleep() {
                System.out.println("Тигр спит");
            }

            @Override
            public String toString() {
                return "Тигр";
            }
        };

        Animal dog = new Animal("Собака") {
            @Override
            public void run(Animal animal) {
                System.out.println("Собака бежит за " + animal.name);
            }

            @Override
            public void sound() {
                System.out.println("Собака лает");
            }

            @Override
            public void sleep() {
                System.out.println("Собака спит");
            }

            @Override
            public String toString() {
                return "Хозяином";
            }
        };

        dog.sleep();
        dog.sound();
        dog.run(tiger);
        tiger.run(tiger);
    }
}
