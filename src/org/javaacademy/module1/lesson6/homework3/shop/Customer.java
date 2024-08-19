package org.javaacademy.module1.lesson6.homework3.shop;

/**
 * Покупатель
 */
public class Customer {
    private static final int COUNT_RULES_FOR_SUCCESS_CHECK = 2;

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    protected void checkShop(Shop shop) {
        int countTest = 0;
        countTest += shop.isClearFloor() ? 1 : 0;
        countTest += shop.isWorkersHasBadge() ? 1 : 0;
        countTest += shop.getCountWorkers() > 2 ? 1 : 0;
        if (countTest >= COUNT_RULES_FOR_SUCCESS_CHECK) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}
