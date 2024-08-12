package org.javaacademy.module1.lesson4.homework4.office;

import org.javaacademy.module1.lesson4.homework4.office.worker.Boss;
import org.javaacademy.module1.lesson4.homework4.office.worker.Manager;
import org.javaacademy.module1.lesson4.homework4.office.worker.Secretary;
import org.javaacademy.module1.lesson4.homework4.office.worker.Security;

public class Office {
    private final Boss boss;
    private final Manager manager;
    private final Secretary secretary;
    private final Security security;

    public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    void workDay() {
        boss.shoutManager(manager);
        manager.shout();
        security.giveMeHalfMoney();
        secretary.keepCalm(boss, manager, security);
    }

}
