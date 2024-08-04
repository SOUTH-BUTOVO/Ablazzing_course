package org.javaacademy.module1.lesson4;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Soldier soldierPetr = new Soldier("Petr", 100);
        Soldier soldierIvan = new Soldier("Ivan", 90);
        Soldier soldierGeneral = new Soldier("Михаил", 100, "Генерал");
        Soldier soldierYuri = new Soldier("Юрий", 110);
        Soldier soldier1 = new Soldier();

//        soldierPetr.name = "Petr";
//        soldierPetr.hp = 100;

        System.out.println("Имя солдата: " + soldierPetr.getName());
        System.out.println("Количество здоровья: " + soldierPetr.getHp());
        System.out.println("----------");

        System.out.println("Имя солдата: " + soldierIvan.getName());
        System.out.println("Количество здоровья: " + soldierIvan.getHp());
        System.out.println("----------");

        soldierPetr.go();
        soldierIvan.go();
        System.out.println("----------");

        soldierPetr.fight(soldierIvan);
        System.out.println("----------");

        //soldierPetr.setHp(-1);
        System.out.println("----------");

        //soldierPetr.onFire();
        System.out.println("----------");

        System.out.println("Звание: " + soldierGeneral.title);
        System.out.println("Звание: " + soldierYuri.title);
        System.out.println("Имя солдатика по умолчанию: " + soldier1.getName());
        System.out.println("----------");

        String artefact1 = "Меч";
        String artefact2 = "Щит";
        String artefact3 = "Лук и стрелы";
//        String[] artefacts = {artefact1, artefact2};
//        soldier1.takeArtefacts(artefacts);
        soldier1.takeArtefacts(artefact1, artefact2, artefact3);
        System.out.println(Arrays.toString(soldier1.getArtefacts()));
    }
}
