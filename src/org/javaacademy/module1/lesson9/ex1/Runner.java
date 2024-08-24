package org.javaacademy.module1.lesson9.ex1;

public class Runner {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 5));
        CalculatorFake calcFake = new CalculatorFake();

        Computer computer1 = new Computer(calc);
        computer1.prtSum(2, 5);

        //Computer computer2 = new Computer(calcFake);
        //computer2.prtSum(2, 5);
    }
}
