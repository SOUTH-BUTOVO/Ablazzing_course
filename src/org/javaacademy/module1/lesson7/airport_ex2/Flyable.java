package org.javaacademy.module1.lesson7.airport_ex2;

public interface Flyable {
    int count = 10;
    void fly();

    default void landing() {
        System.out.println("Летящий объект приземлился");
    }
}
