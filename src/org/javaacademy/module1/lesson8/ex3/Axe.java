package org.javaacademy.module1.lesson8.ex3;

// Топор
public class Axe {
    private boolean isBroken;

    // Ломаем топор
    public void broken() {
        isBroken = true;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
