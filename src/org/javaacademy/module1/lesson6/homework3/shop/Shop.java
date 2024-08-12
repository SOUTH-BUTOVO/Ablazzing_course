package org.javaacademy.module1.lesson6.homework3.shop;

/**
 * Магазин
 */
public class Shop {
    private final boolean isClearFloor; //Чистый пол
    private final boolean workersHasBadge; //Есть ли бейджики у сотрудников
    private final int countWorkers; //Количество работников в магазине

    public Shop(boolean isClearFloor, boolean workersHasBadge, int countWorkers) {
        this.isClearFloor = isClearFloor;
        this.workersHasBadge = workersHasBadge;
        this.countWorkers = countWorkers;
    }

    protected boolean checkShop() {
        int countTest = 0;
        if (isClearFloor) {
            countTest++;
        }
        if (workersHasBadge) {
            countTest++;
        }
        if (countWorkers > 2) {
            countTest++;
        }
        if (countTest >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
