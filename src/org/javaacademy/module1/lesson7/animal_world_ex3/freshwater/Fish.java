package org.javaacademy.module1.lesson7.animal_world_ex3.freshwater;

public abstract class Fish extends Freshwater {

    protected int maxCountCaviar;

    public Fish(int maxCountCaviar) {
        this.maxCountCaviar = maxCountCaviar;
    }

    void swim() {
        System.out.println("плывёт");
    }

    public void breathe() {
        System.out.println("дышит жабрами");
    }
}
