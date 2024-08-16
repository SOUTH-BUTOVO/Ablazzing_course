package org.javaacademy.module1.lesson7.animal_world_ex3.freshwater;

public class Carp extends Fish {

    private String color;

    public Carp(int maxCountCaviar, String color) {
        super(maxCountCaviar);
        this.color = color;
    }

    @Override
    void swim() {
        System.out.println("Карп ");
        super.swim();
        System.out.println(" красиво");
    }

    @Override
    public void breathe() {
        System.out.print("Карп ");
        super.breathe();
    }
}
