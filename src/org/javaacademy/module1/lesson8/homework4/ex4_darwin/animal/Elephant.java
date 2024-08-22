package org.javaacademy.module1.lesson8.homework4.ex4_darwin.animal;

import org.javaacademy.module1.lesson8.homework4.ex4_darwin.Herbivore;
import org.javaacademy.module1.lesson8.homework4.ex4_darwin.MyLiveException;

public class Elephant extends Herbivore {
    public Elephant(String typeName, double weight, boolean alive) {
        super(typeName, weight, alive);
    }

    @Override
    public void run() throws MyLiveException {
        if (isAlive()) {
            System.out.println(getTypeName() + " медленно бежит");
        } else {
            throw new MyLiveException(getTypeName() + " мёртвый не бегает");
        }
    }
}
