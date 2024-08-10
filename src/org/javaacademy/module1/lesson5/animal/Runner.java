package org.javaacademy.module1.lesson5.animal;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Dog dog1 = new Dog("Мухтар");
        Dog dog2 = new Dog("Перс");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("------------------");

        AnotherClass.createDogs();

        System.out.println(Arrays.toString(Dog.dogs));

        System.out.println("У всех собак, количество ног: " + Dog.COUNT_LEGS_FINAL_STATIC);
        System.out.println("------------------");

        Dog.prtInfoDogs();
    }
}
