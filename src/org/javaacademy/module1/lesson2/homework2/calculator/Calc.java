package org.javaacademy.module1.lesson2.homework2.calculator;

import java.util.Scanner;

//Необходимо написать калькулятор. Алгоритм:
//1. Вывести на экран: Введите первое число
//2. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
//3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
//4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
//4. Вывести на экран: Введите второе число
//5. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
//6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
//Если знак операции не относится к перечисленным выше, вывести - "Ошибка"

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите знак операции: +, -, *, /");
        // Не понял, как использовать .nextLine(), т.к. он пробрасывает в условие if и
        // печатает System.out.println("Ошибка, этот знак не относится к операндам!\n");

        // Юра, как ты показал в воскресенье про Double.parseDouble(scanner.nextLine())
        // но нам нужно не double, а получить знак "+", "-", "*", "/".
        // Поэтому .next(); отлично отрабатывает.
        String operationSign = scanner.next();
        if (!operationSign.equals("+") && !operationSign.equals("-") &&
            !operationSign.equals("*") && !operationSign.equals("/")) {
            System.out.println("Ошибка, этот знак не относится к операндам!\n");
            //return; // В случае ошибки, можно завершить выполнение программы.
        }

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        if (operationSign.equals("+")) {
            System.out.println("Результат вычисления = " + (num1 + num2));
        } else if (operationSign.equals("-")) {
            System.out.println("Результат вычисления = " + (num1 - num2));
        } else if (operationSign.equals("*")) {
            System.out.println("Результат вычисления = " + (num1 * num2));
        } else if (operationSign.equals("/")) {
            System.out.println("Результат вычисления = " + (num1 / num2));
        }
        scanner.close();
    }
}
