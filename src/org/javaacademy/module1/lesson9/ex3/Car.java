package org.javaacademy.module1.lesson9.ex3;

public class Car {
    private Engine engine = new Engine(10);

    public static class Engine {
        int b = 2;
        private int power;

        public Engine(int power) {
            this.power = power;
        }
        Car car = new Car();

        public void doSomething2() {
        }
    }

    public static void doSomething() {

    }

}
