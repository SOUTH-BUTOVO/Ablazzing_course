package org.javaacademy.module1.lesson4.homework4.office.worker;

public class Boss extends WorkerWithName {

    public Boss(String name) {
        super(name);
    }

    public void shoutManager(Manager manager) {
        System.out.printf("%s быстрее!\n", manager.getName());
    }
}
