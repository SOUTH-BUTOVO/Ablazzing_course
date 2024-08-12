package org.javaacademy.module1.lesson4.homework4.office.worker;

public class Secretary {
    final static String STR = "%s не волнуйтесь, %s все успеет. %s - подождите!";

    public void keepCalm(Boss boss, Manager manager, Security security) {
//        String fString = STR.formatted(boss.getName(), manager.getName(), security.getName());
//        System.out.println(fString);

        System.out.printf(STR, boss.getName(), manager.getName(), security.getName());
    }
}
