package org.javaacademy.module1.lesson7.airport_ex2;

public class Duck implements Flyable {
    private boolean isMale;

    public Duck(boolean isMale) {
        this.isMale = isMale;
    }

    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public String toString() {
        return "Duck{" + "isMale=" + isMale + '}';
    }
}
