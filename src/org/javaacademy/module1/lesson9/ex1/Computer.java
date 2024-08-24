package org.javaacademy.module1.lesson9.ex1;

public class Computer {
    private Calculator calculator;

    public Computer(Calculator calculator) {
        this.calculator = calculator;
    }

    public void prtSum(int num1, int num2) {
        System.out.println(calculator.sum(num1, num2));
        System.out.println(calculator.num3);
    }

}
