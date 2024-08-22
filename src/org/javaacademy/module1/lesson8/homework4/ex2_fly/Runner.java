package org.javaacademy.module1.lesson8.homework4.ex2_fly;

public class Runner {
    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        try {
            duck1.fly();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            duck2.fly();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            airplane1.fly();
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        try {
            airplane2.fly();
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
