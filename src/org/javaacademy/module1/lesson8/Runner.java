package org.javaacademy.module1.lesson8;

public class Runner {
    public static void main(String[] args) {

        try {
            String myName = null;
            myName.toLowerCase();
            System.out.println(myName);
        } catch (NullPointerException e) {
            System.out.println("Переменная myName = null " + e.getMessage());
        }

        try {
            calc(1, 0);
        } catch (Exception e) {
            System.out.println("У нас произошла ошибка, но мы двигаемся дальше " + e.getMessage());
        }
        System.out.println("Следующая операция");
    }

    static void calc(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}
