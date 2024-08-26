package org.javaacademy.module1.lesson10.ex2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        File fileTrack = new File("P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing_project\\my_data.txt");
        Scanner scanner = new Scanner(fileTrack);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            System.out.println(string);
        }
        scanner.close();
    }

    private static void ex1() throws IOException {
        String fileTrack = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing_project\\my_data.txt";
        String str = "";
        try (FileReader fileReader = new FileReader(fileTrack)) {
            while (fileReader.ready()) {
                str += fileReader;
                System.out.print((char) fileReader.read());
            }
            System.out.println();
        }
    }
}
