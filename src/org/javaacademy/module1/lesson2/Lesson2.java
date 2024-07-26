package org.javaacademy.module1.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int money = 150;
        boolean isBlackBread = false;
//        boolean res = money > 100;
        if (money >= 100) {
            if (isBlackBread) {
                System.out.println("Покупаю дорогой чёрный хлеб");
            } else {
                System.out.println("Покупаю дорогой белый хлеб");
            }
        } else if (money > 50) {
            System.out.println("Покупаю хлеб средней стоимости");
        } else {
            System.out.println("Покупаю дешёвый хлеб хлеб");
        }
        System.out.println("---------------------");

        int money2 = 150;
        int breadPrice = 120;
        int waterPrice = 20;
        if (money2 >= breadPrice + waterPrice) {
            System.out.println("Покупаю хлеб и воду");
        } else {
            System.out.println("Ничего не покупаю");
        }
        System.out.println("---------------------");

        int breadPrice2 = 90;
        int waterPrice2 = 10;
        if (breadPrice2 > 100 || waterPrice2 > 15) {
            System.out.println("Выхожу из дорогого магазина");
        } else {
            System.out.println("Покупаю товары");
        }
        System.out.println();

        if (breadPrice2 > 110 && breadPrice2 < 120) {
            System.out.println("Есть хлеб от 110 до 120");
        } else {
            System.out.println("Нет хлеба от 110 до 120");
        }
        System.out.println("---------------------");

        boolean isRedCar = false;
        boolean isCar = true;

        if (isRedCar || isCar) {
            System.out.println("У тебя есть красная машинка");
        } else {
            System.out.println("У тебя нет красной машинки");
        }
        System.out.println("---------------------");

        boolean isOlderThan18 = true;
        if (!isOlderThan18) {
            System.out.println("Старше 18");
        } else {
            System.out.println("Меньше или равно 18");
        }
    }
}
