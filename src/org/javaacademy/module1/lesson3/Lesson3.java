package org.javaacademy.module1.lesson3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        //Список студентов на курсе
        String[] students = new String[3];
        students[0] = "Сидоров";
        students[1] = "Иванов";
        students[2] = "Петров";

        System.out.println(Arrays.toString(students));

        //[Сидоров, Иванов, Петров]
        //System.out.println(students[4]); - Exceptions
        //[null, null, Козлов]
        String[] secondsStudents = new String[3];
        secondsStudents[2] = "Козлов";
        System.out.println(Arrays.toString(secondsStudents));

        //Примитивы:
        //boolean, byte, short, int, long, float, double, char
        boolean[] answers = new boolean[3];
        System.out.println(Arrays.toString(answers));

        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));

        char[] chars = new char[3];
        System.out.println(Arrays.toString(chars));

        //Ссылочный тип данных
        String myName = "Sergey";
        System.out.println(myName);
        System.out.println("------------");

        char[] letters = {'a', 'b', 'c'};
        System.out.println(letters);
        //Длинна массива
        System.out.println(letters.length);
        System.out.println("------------");

        //Распечатать каждого студента на новой строке
        String[] studentsCopy = new String[3];
        studentsCopy[0] = "Сидоров";
        studentsCopy[1] = "Иванов";
        studentsCopy[2] = "Петров";

        for (String studentName : studentsCopy) {
            System.out.println(studentName);
        }
        System.out.println("------------");

        //Посчитать сумму покупок из магазина
        double[] orders = {2.5, 1.5, 2, 2};
        double sum = 0;
        for (double order : orders) {
            sum += order;
        }
        System.out.println("Итоговая сумма покупок составила: " + sum);
        System.out.println("------------");

        //Распечатать только чётные цифры из рулетки
        int[] roulette = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (int num : roulette) {
                System.out.print(num % 2 == 0 ? "Чётное число: " + num + ", " : "");
        }
        System.out.println("\n------------");

        //Распечатать только первые 5 выпавших цифр
        int[] rouletteRes = {36, 5, 10, 12, 1, 2, 7, 8};
        int count = 0;
        for (int rouletteNum : rouletteRes) {
            System.out.print(rouletteNum + " ");
            count++;
            if (count == 5) {
                break;
            }
        }
        System.out.println("\n------------");

        for (int i = 0; i < 5; i++) {
            System.out.print(rouletteRes[i] + " ");
        }
        System.out.println("\n------------");

        //Посчитать сумму последних 5 элементов
        int sum2 = 0;
        for (int i = rouletteRes.length - 1; i > rouletteRes.length - 6; i--) {
            System.out.print(rouletteRes[i] + " ");
            sum2 += rouletteRes[i];
        }
        System.out.println("\nСумма последних 5 элементов = " + sum2);
        System.out.println("------------");

        // Пропустить первые 3 числа
        for (int i = 0; i < rouletteRes.length; i++) {
            if (i <= 2) {
                continue;
            }
            System.out.print(rouletteRes[i] + " ");
        }
        System.out.println("\n------------");

        //Сумма чисел от 1 до ...
        int countNum = 1;
        int sum3 = 0;
        while (true) {
            sum3 += countNum;
            countNum++;
            if (countNum > 10) {
                break;
            }
        }
        System.out.print("Сумма чисел от 1 до 10: " + sum3 + " ");
        System.out.println("\n------------");

        //Сохранение результатов за несколько дней
        int[] day1 = {36, 2, 10, 17, 7};
        int[] day2 = {3, 5, 2, 9, 11};
        int[] day3 = {6, 9, 21, 33, 0};
        int[][] daysStatistics = new int[3][];
        daysStatistics[0] = day1;
        daysStatistics[1] = day2;
        daysStatistics[2] = day3;

        for (int[] daysStatistic : daysStatistics) {
            System.out.println(Arrays.toString(daysStatistic));
//            for (int day : daysStatistic) {
//                System.out.print(day + " ");
//            }
        }

        //Найти в статистике по всем дням число 9 и распечатать "Выпала 9"
        array1:
        for (int[] daysStatistic : daysStatistics) {
            System.out.println("Печать 1");
            for (int num : daysStatistic) {
                if (num == 9) {
                    System.out.println("Выпала 9");
                    break array1;
                }
                System.out.println("abc");
            }
            System.out.println("123");
        }
        System.out.println("Печать 2");
    }
}
