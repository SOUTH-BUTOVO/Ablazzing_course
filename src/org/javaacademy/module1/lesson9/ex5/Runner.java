package org.javaacademy.module1.lesson9.ex5;

public class Runner {
    public static void main(String[] args) {

        Movable helicopter = () -> System.out.println("Вертолёт летит вперёд");

        Movable dog = new Movable() {
            @Override
            public void go() {
                System.out.println("Собака бежит вперёд");
            }
        };

        Movable car = new Movable() {
            @Override
            public void go() {
                System.out.println("Машина едет вперёд");
            }
        };

        Movable[] movables = {helicopter, dog, car};
        for (Movable movable : movables) {
            movable.go();
        }
    }
}
