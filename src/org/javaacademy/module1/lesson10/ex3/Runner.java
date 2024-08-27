package org.javaacademy.module1.lesson10.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String fileTrack = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing_project\\numbers.txt";
        File file = new File(fileTrack);
        Scanner scanner = new Scanner(file);
        int totalSum = 0;
        int countLines = 1;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            if (countLines % 2 != 0) {
                totalSum += Integer.parseUnsignedInt(nextLine);
            }
            countLines++;
        }
        System.out.println(totalSum);

        scanner.close();
    }
}
