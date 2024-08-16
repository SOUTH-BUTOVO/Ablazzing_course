package org.javaacademy.module1.lesson7.animal_world_ex3.freshwater;

public class Salmon extends Fish {

    private String color;

    public Salmon(int maxCountCaviar, String color) {
        super(maxCountCaviar);
        this.color = color;
    }

    @Override
    void swim() {
        System.out.println("Лосось ");
        super.swim();
        System.out.println(" против течения");
    }

    @Override
    public void breathe() {
        System.out.print("Лосось ");
        super.breathe();
    }
}
