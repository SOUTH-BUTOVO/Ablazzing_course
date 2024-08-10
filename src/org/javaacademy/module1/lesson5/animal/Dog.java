package org.javaacademy.module1.lesson5.animal;

public class Dog {
    private String name;
    static Dog[] dogs = new Dog[10];
    static int count = 0;

    private Dog[] childs;
    private int countLegs = 4;
    public final static int COUNT_LEGS_FINAL_STATIC = 4;

    public Dog(String name) {
        this.name = name;
        dogs[count++] = this;
    }

    static void prtInfoDogs() throws InterruptedException {
        for (Dog dog : dogs) {
            if (dog != null) {
                System.out.println(dog);
            } else {
                continue;
            }
            //System.out.println("Работа цикла дальше...");
            Thread.sleep(1000);
        }
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + '}';
    }
}
