package org.javaacademy.module1.lesson10.ex4;

import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        String projectTrack = "P:\\iT6ka\\JAVA\\PROJECTS\\Ablazzing_project";
        String fileName = "lesson10.txt";
        String path = projectTrack + "\\" + fileName;

        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.write("У меня 10 урок идёт сейчас");
            fileWriter.write("\n");
            fileWriter.write("У меня 10 урок идёт сейчас\n");
            fileWriter.append("\nУ меня 10 урок идёт сейчас");
        }
    }
}
