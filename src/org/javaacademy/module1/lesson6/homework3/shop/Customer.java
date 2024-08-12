package org.javaacademy.module1.lesson6.homework3.shop;

/** Покупатель */
public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    protected void checkShop(Shop shop) {
        if (shop.checkShop()) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}
