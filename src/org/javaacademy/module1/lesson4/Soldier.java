package org.javaacademy.module1.lesson4;

/** Класс Солдатик */

public class Soldier {
    String name;
    int hp;
    String title = "Рядовой";
    String[] artefacts;

    //Конструктор
    public Soldier() {
        this.name = "Безымянный солдатик";
        this.hp = 100;
    }

    public Soldier(String name, int hp) {
        this.name = name;
        setHp(hp);
    }

    public Soldier(String name, int hp, String title) {
        this.name = name;
        setHp(hp);
        this.title = title;
    }

    public void go() {
        System.out.println("Солдатик " + this.name + " идёт вперёд");
    }

    public void fight(Soldier anotherSoldier) {
        if (this.hp > anotherSoldier.hp) {
            System.out.println("Победил " + this.name);
            anotherSoldier.setHp(0);
        } else {
            System.out.println("Победил " + anotherSoldier.name);
            this.setHp(0);
        }
    }

    public void takeArtefacts(String... artefacts) {
        this.artefacts = artefacts;
    }

    public void setHp(int hp) {
        if (hp >= 0 && hp <= 100) {
            this.hp = hp;
        } else {
            System.out.println("Ошибка, не можем присвоить отрицательное здоровье.");
        }
    }

    public String getName() {
        return this.title + " " + this.name;
    }

    public int getHp() {
        return hp;
    }

    public String[] getArtefacts() {
        return artefacts;
    }

    public String getTitle() {
        return title;
    }

    public void onFire() {
        while (true) {
            if (this.hp == 0) {
                return;
            }
            this.setHp(this.hp - 1);
            System.out.println("Горю!");
            System.out.println("*Здоровье солдатика: " + this.hp);
        }
    }
}
