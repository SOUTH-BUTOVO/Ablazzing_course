package org.javaacademy.module1.lesson10.homework5.ex1_donation;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

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
        //File myDonat = new File("resources" + separator + "donation.csv");
        // Без сепаратора то же работает, можно указать:
        // File myDonat = new File("resources/donation.csv");

        Path pathMyDonat = Path.of("resources/donation.csv");
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String listDonats = Files.readString(pathMyDonat); // Создаём переменную String, список всех донатов
        String listCountries = "";
        int countLines = 1; // Считаем кол-во строк в списке донатов

        String[] lines = listDonats.split("\n");
        System.out.println(Arrays.toString(lines));
        int count = 0;
        for (String line : lines) {
            count++;
        }
        System.out.println(lines.length);
        System.out.println(count);

        try (Scanner scanner = new Scanner(listDonats)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("d")) {
                    continue;
                } else {
                    listCountries += line + "\n";
                    countLines++;
                }
            }
//            System.out.print(listCountries);
//            System.out.println(countLines);


            String[] countryDonat = {};
            String[] sumDonat = {};
            for (int i = 0; i < countLines; i++) {

            }
            //System.out.println(listDonats);

            String newStr = "";
            int countryIndex = listDonats.indexOf(";");
            for (int i = 0; i < countLines; i++) {
                newStr += listDonats.substring(0, countryIndex) + "\n";
            }
            //System.out.print(newStr);
        }
    }
}
