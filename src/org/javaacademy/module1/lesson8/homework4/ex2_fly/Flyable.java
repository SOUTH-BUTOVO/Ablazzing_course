package org.javaacademy.module1.lesson8.homework4.ex2_fly;

public interface Flyable {
    default void fly() {
        System.out.println("летит");
    }
}
