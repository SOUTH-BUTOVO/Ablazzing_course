package org.javaacademy.module1.lesson10.homework5.ex2_spy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ComputerSpy extends Computer {
    private Path pathSpyFile = Path.of("resources/comp.log");

    private Computer computer;

    public ComputerSpy(User user) {
        super(user);
    }

    protected void entryUserSpy(Computer computer) throws IOException {
        String str = "Пользователь \"" + computer.user.getName() + "\", вошёл в систему!";
        if (computer.user != null) {
            try (BufferedWriter writer = Files.newBufferedWriter(pathSpyFile, StandardOpenOption.APPEND)) {
                writer.append(str).append("\n");
            } catch (NullPointerException e) {
                System.out.println("Войдите в систему");
            }
        }
    }

    protected void prtMessageSpy(Computer computer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение: ");
        String str = "сообщение: " + scanner.nextLine();
        if (computer.user != null) {
            try (BufferedWriter writer = Files.newBufferedWriter(pathSpyFile, StandardOpenOption.APPEND)) {
                writer.append(str);
                writer.newLine();
            } catch (IOException e) {
                System.out.println("Войдите в систему");
            }
        }
    }

    protected void exitUserSpy(Computer computer) {
        String str = "Пользователь \"" + computer.user.getName() + "\", вышел из системы.";
        if (computer.user != null) {
            try (BufferedWriter writer = Files.newBufferedWriter(pathSpyFile, StandardOpenOption.APPEND)) {
                writer.append(str + "\n");
                computer.user.setName(null);
            } catch (Exception e) {
                System.out.println("Войдите в систему");
            }
        }
    }
}
