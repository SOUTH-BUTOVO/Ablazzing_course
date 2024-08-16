package org.javaacademy.module1.lesson7.animal_world_ex3.mammal;

public class Rat extends Mammal {

    private int tailLength;

    public Rat(int tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    void feed() {
        System.out.println("Крыса ест сыр");
    }

    @Override
    public void breathe() {
        System.out.print("Крыса ");
        super.breathe();
    }
}
