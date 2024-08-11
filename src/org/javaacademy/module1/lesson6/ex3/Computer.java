package org.javaacademy.module1.lesson6.ex3;

public class Computer {

    // Перегрузка метода
    void sayHello() {
        System.out.println("Привет");
    }

    // Перегрузка метода
    void sayHello(String name) {
        System.out.println("Привет " + name);
    }

    // Переопределение (перезапись) метода
    @Override
    public String toString() {
        return "Это компьютер";
    }
}
