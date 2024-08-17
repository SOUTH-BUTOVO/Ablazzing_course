package org.javaacademy.module1.lesson7.animal_world_ex3.mammal;

public class Dog extends Mammal {

    private String ownerName;

    public Dog(String ownerName) {
        this.ownerName = ownerName;
    }

    void voice() {
        System.out.println("Собака лает");
    }

    @Override
    public void breathe() {
        System.out.print("Собака ");
        super.breathe();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
