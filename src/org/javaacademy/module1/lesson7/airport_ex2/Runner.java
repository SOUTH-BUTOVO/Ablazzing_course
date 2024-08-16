package org.javaacademy.module1.lesson7.airport_ex2;

public class Runner {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(100);
        Duck duck = new Duck(true);
        Flyable[] flyables = {airplane, duck};

        System.out.println(Flyable.count);

        for (Flyable flyable : flyables) {
            System.out.println(flyable);
            flyable.fly();
            flyable.landing();
        }
        System.out.println("----------");

        Helicopter mi20Helicopter = new Mi20Helicopter();
        mi20Helicopter.flyVertical();
        mi20Helicopter.fly();
        System.out.println("----------");

        Flyable flyable = new Mi20Helicopter();
        flyable.landing();
    }
}
