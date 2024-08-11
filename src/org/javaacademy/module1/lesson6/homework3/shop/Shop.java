package org.javaacademy.module1.lesson6.homework3.shop;

/** Магазин */
public class Shop {
    private boolean isClearFloor; //Чистый пол
    private boolean workersHasBadge; //Есть ли бейджики у сотрудников
    private int countWorkers; //Количество работников в магазине

    //1. Магазин мог создаваться во всех классах любых пакетов
//2. Атрибуты магазина и покупателя соответствовали правилам инкапсуляции

    private Shop(boolean isClearFloor, boolean workersHasBadge, int countWorkers) {
        this.isClearFloor = isClearFloor;
        this.workersHasBadge = workersHasBadge;
        this.countWorkers = countWorkers;
    }
}
