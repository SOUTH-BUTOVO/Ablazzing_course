package org.javaacademy.module1.lesson4.homework4.office.worker;

public class Security extends WorkerWithName {

    public Security(String name) {
        super(name);
    }

    public void giveMeHalfMoney() {
        System.out.println("прошу выдать мне аванс!");
    }
}
