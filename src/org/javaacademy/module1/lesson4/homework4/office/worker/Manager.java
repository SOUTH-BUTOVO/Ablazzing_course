package org.javaacademy.module1.lesson4.homework4.office.worker;

public class Manager extends WorkerWithName {

    public Manager(String name) {
        super(name);
    }

    public void shout() {
        System.out.println("я ничего не успеваю, помогите!");
    }
}
