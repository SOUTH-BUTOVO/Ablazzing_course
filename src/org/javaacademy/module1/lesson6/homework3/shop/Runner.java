package org.javaacademy.module1.lesson6.homework3.shop;

public class Runner {
    public static void main(String[] args) {
        Shop shop = new Shop(false, true, 2);
        Customer customerOleg = new Customer("Олег");
        customerOleg.checkShop(shop);
    }
}
