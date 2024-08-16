package org.javaacademy.module1.lesson7.animal_world_ex3.mammal;

import org.javaacademy.module1.lesson7.animal_world_ex3.Breathe;

public abstract class Mammal implements Breathe {

    void feed() {
        System.out.println("Кормит молоком");
    }

    public void breathe() {
        System.out.println("дышит лёгкими");
    }
}
