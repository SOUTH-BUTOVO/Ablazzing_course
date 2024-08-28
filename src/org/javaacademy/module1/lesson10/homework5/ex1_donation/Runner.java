package org.javaacademy.module1.lesson10.homework5.ex1_donation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//Донаты со всего мира
//Одному блогеру присылают пожертвования(донаты) за его ролики
//Данные о пожертвованиях содержатся в файле donation.csv (папка resources)
//Необходимо посчитать сумму пожертвований от пользователей из каждой страны
//Если сумма написана некорректно, то программа должна пропускать строчку (не завершать работу)
//String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
//String filename = "donation.csv";
//Чтение файла из папки resources (без привязки к конкретному расположению проекта)
//Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
//System.out.println(scanner.nextLine());

//Ожидаемый вывод:
//Список пожертвований по странам (пример):
//Россия - 14233.00
//Франция - 8000.32
//Китай - 20000.11
//Япония - 124.10
//Турция - 777.55

public class Runner {
    public static void main(String[] args) throws IOException {
        //String separator = File.separator;
        //File pathFileMyDonat = new File("resources" + separator + "donation.csv");
        // Без сепаратора то же работает, но зависит от ОС:
        // File pathFileMyDonat = new File("resources/donation.csv");

        Path pathFileMyDonat = Path.of("resources/donation.csv");
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        double[] totalSum = new double[5];
        // Создаём переменную String, список всех донатов и меняем ',' на '.'
        String listDonat = Files.readString(pathFileMyDonat).replaceAll(",", ".");
        String[] arrDonat = listDonat.split("\n"); // Создаём массив донатов
        int indexStart = 0;

        for (int i = 1; i < arrDonat.length; i++) {
            indexStart = arrDonat[i].indexOf(";") + 1;
            try {
                // Парсим строку в Double, если не получается выбрасываем исключение
                Double.parseDouble(arrDonat[i].substring(indexStart));
                for (int j = 0; j < countries.length; j++) {
                    if (arrDonat[i].contains(countries[j])) {
                        totalSum[j] += Double.parseDouble(arrDonat[i].substring(indexStart));
                    }
                }
                // Исключение: строки  6-"Китай;159,58d", 206-"Турция;42!5,15" и 973-"Россия;229,66s"
            } catch (NumberFormatException e) {
                // !!! Юра, я не доконца понял, почему тут одна строка печатается не правильно,
                // Вместо (Китай;159,58d), печатается (Франция;75T1.99), возможно из-за символа d,
                // но можно это и не печатать.
                //System.out.println(arrDonat[i] + " - Не корректная строка");
            }
        }
        // Распечатываем страны и сумму доната из этой страны
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i] + " - " + totalSum[i]);
        }
    }
}
