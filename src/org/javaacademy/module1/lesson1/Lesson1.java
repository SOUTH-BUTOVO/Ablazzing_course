package org.javaacademy.module1.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Привет мир!");

        boolean hasSignal = true; // 1
        boolean noSignal = false; // 0

        byte ipAddress = 127; // 255 1111 1111
        byte ipaddress = -128; // 255 1111 1111

        // 2 bytes
        short number = 32_767;
        short minNumber = -32_768;

        //4 bytes 32 bit
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        // 8 bytes
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        int number1 = 10;
        int number2 = 2;

        System.out.println("Операция сложения: " + (number1 + number2));
        int minusResult = number1 - number2;
        System.out.println("Операция вычитания: " + minusResult);
        System.out.println("Операция деления: " + (number1 / number2));
        System.out.println("Операция умножения: " + (number1 * number2));

        // 4 bytes - 32 bit
        float dollarRate = 88.6F;
        System.out.println("Сколько знаков после запятой может быть: " + 1.1234567F);

        // 8 bytes - 64 bit
        System.out.println("Сколько знаков после запятой может быть DOUBLE: " + 1.123456789012345);

        char randomSymbol = 'K' + 2;
        System.out.println("Печать символа: " + randomSymbol);

        String text = "Это какой то текст";
        System.out.println(text);

        //перевод в верхний регистр
        System.out.println("перевод в верхний регистр всех символов строки: " + text.toUpperCase());
        System.out.println("-----------------------");

        //перевод в нижний регистр
        System.out.println("перевод в нижний регистр всех символов строки: " + text.toLowerCase());
        System.out.println("-----------------------");

        //есть ли искомый текст в нашем тексте, поиск подстроки
        System.out.println("содержит ли строка искомую подстроку: " + text.contains("это"));
        System.out.println("-----------------------");

        String textLowerCase = text.toLowerCase();
        System.out.println(textLowerCase.contains("это"));
        System.out.println("-----------------------");

        //повторение текста n раз
        System.out.println("повторение строки N раз: " + (text + " | ").repeat(5));
        System.out.println("-----------------------");

        // обрезка строки
        System.out.println("получение по диапазону символов из строки: " + text.substring(0, 3));
        System.out.println("-----------------------");

        // длинна текста
        System.out.println("длинна текста: " + text.length());

        // обрезка пробелов вначале и конце строки
        String textWithBlanks = "   это  текст   с пробелами   и  ";
        System.out.println(textWithBlanks.trim());

        // обрезка пробелов вначале и конце строки .trim() + удаление пробелов если их больше одного
        // в самой строке.
        System.out.println(textWithBlanks.trim().replaceAll(" +", " "));
    }
}
