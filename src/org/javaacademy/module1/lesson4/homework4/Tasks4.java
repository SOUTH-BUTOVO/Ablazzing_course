package org.javaacademy.module1.lesson4.homework4;

import java.util.Arrays;
import java.util.Random;

public class Tasks4 {
    public static void main(String[] args) {
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        String strTask = "Это-шашлык-на-шампуре";
        stringBarbecue(words, strTask);
        System.out.println("---------------------");

        sumDiagonals();
        System.out.println("---------------------");

        randomNum();
        System.out.println("---------------------");

        // Сделал с помощью интернета, т.к. не понимал почему переворачивалась только
        // половина массива и массив шёл на увеличение значений.
        // В итоге понял, что к чему. Чем то похоже на сортировку пузырьком.
        massReverse();
        System.out.println("---------------------");
    }

    private static void massReverse() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numbers) + " Original");
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - (i + 1)];
            numbers[numbers.length - (i + 1)] = temp;
        }
        System.out.println(Arrays.toString(numbers) + " Reverse");
    }

    private static void randomNum() {
        Random random = new Random(1);
        int numberSearch = 999;
        for (int i = 1; true; i++) {
            int number = random.nextInt(1000);
            if (number == numberSearch) {
                System.out.println("Число " + numberSearch +
                             ", было найдено с " + (i) + "й попытки.");
                break;
            }
        }
    }

    private static void sumDiagonals() {
        //Посчитать сумму каждой диагонали ИСПОЛЬЗУЯ цикл(ы)
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};
        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;
        //С левого верхнего угла к нижнему правому
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers.length; j++) {
                if (i == j) {
                    leftUpToRightDownSum += arrayOfNumbers[i][j];
                }
            }
        }
        //С левого нижнего угла к верхнему правому
        for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrayOfNumbers.length; j++) {
                if (i + j == arrayOfNumbers.length - 1) {
                    leftDownToRightUpSum += arrayOfNumbers[i][j];
                }
            }
        }
        System.out.println("Сумма диагонали, с левого верхнего угла, до нижнего правого = " +
                                                              leftUpToRightDownSum); //1509
        System.out.println("Сумма диагонали, с левого нижнего угла, до верхнего правого = " +
                                                              leftDownToRightUpSum); //1053

    }

    private static void stringBarbecue(String[] words, String strTask) {
        //С помощью циклов и функции String.substring составить итоговый текст
        String strCycle = "";
        for (String word : words) {
            strCycle += word + "-";
        }
        String strResult = strCycle.substring(0, strCycle.length() - 1);
        System.out.println(strResult.equals(strTask)); // true
    }
}
