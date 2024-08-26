package org.javaacademy.module1.lesson9.ex7;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void greeting(Human human) {
        System.out.println("Привет, меня зовут " + this.name);
        human.greeting(this);
    }
}
