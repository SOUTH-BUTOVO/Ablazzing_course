package org.javaacademy.module1.lesson10.homework5.ex2_spy;

import java.util.Scanner;

public class Computer {
    User user;

    public Computer(User user) {
        this.user = user;
    }

    protected void entryUser(User user) {
        if (user != null) {
            System.out.println("Пользователь " + user.getName() + " вошёл в систему.");
        } else {
            System.out.println("Войдите в систему");
        }
    }

    protected String prtMessage(User user) {
        if (user != null) {
            System.out.println("Введите сообщение: ");
            Scanner scanner = new Scanner(System.in);
            return "сообщение: " + scanner.nextLine();
        }
        return "Войдите в систему";
    }

    protected void exitUser(User user) {
        user.setName(null);
    }
}
