package org.javaacademy.module1.lesson9.ex1;

public class Calculator2 {
    int num3 = 3;

    public final int sum(int num1, int num2) { // наследник не сможет переопределить метод
        return num1 + num2;
    }

    public int getNum3() {
        return num3;
    }
}
