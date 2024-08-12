package org.javaacademy.module1.lesson4.homework4.office;

import org.javaacademy.module1.lesson4.homework4.office.worker.Boss;
import org.javaacademy.module1.lesson4.homework4.office.worker.Manager;
import org.javaacademy.module1.lesson4.homework4.office.worker.Secretary;
import org.javaacademy.module1.lesson4.homework4.office.worker.Security;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Secretary secretary = new Secretary();
        Security security = new Security("Петрович");

        Office office = new Office(boss, manager, secretary, security);
        office.workDay();
    }
}
