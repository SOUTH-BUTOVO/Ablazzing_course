package org.javaacademy.module1.lesson7.animal_world_ex3;

import org.javaacademy.module1.lesson7.animal_world_ex3.freshwater.Carp;
import org.javaacademy.module1.lesson7.animal_world_ex3.freshwater.Salmon;
import org.javaacademy.module1.lesson7.animal_world_ex3.mammal.Dog;
import org.javaacademy.module1.lesson7.animal_world_ex3.mammal.Rat;

public class Runner {
    public static void main(String[] args) {
        // Воссоздать цепочку в Джава
        //                                  Умеет дышать
        //                                  /          \
        //  Млекопитающее (умеет кормить молоком)   Пресноводное (умеет плавать)
        //      /                   \                           \
        //  Крыса (есть сыр)   Собака (лаять)                   Рыба
//                                                             /    \
//                                                         Карп      Лосось

        // Крыса обладает длиной хвоста
        // Собака обладает хозяином
        // Рыба обладает макс количеством икры.

        Dog dog = new Dog("Сергей");
        Rat rat = new Rat(100);
        Carp carp = new Carp(1_000_000, "Gold");
        Salmon salmon = new Salmon(10_000_000, "Black");

        Breathe[] breathes = {dog, rat, carp, salmon};
        for (Breathe breathe : breathes) {
            breathe.breathe();
        }


//        dog.feed();
//        rat.feed();
    }
}
