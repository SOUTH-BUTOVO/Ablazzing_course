package org.javaacademy.module1.lesson8.homework4.ex4_darwin;

public abstract class Live {
    private final String typeName;
    private double weight;
    private boolean alive;

    public Live(String typeName, double weight, boolean alive) {
        this.typeName = typeName; // вес
        this.weight = weight; // вес
        this.alive = alive; // жив/мертв
    }

    public String getTypeName() {
        return typeName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Live{" + "typeName='" + typeName + '\'' + ", weight=" + weight + ", alive=" + alive + '}';
    }
}
