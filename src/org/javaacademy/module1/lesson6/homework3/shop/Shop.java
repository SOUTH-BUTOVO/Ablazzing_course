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

    public boolean isClearFloor() {
        return isClearFloor;
    }

    public boolean isWorkersHasBadge() {
        return workersHasBadge;
    }

    public int getCountWorkers() {
        return countWorkers;
    }
}
