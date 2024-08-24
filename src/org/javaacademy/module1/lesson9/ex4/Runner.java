package org.javaacademy.module1.lesson9.ex4;

public class Runner {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer();
        swimmer.train();


        SportHuman soccerMan = new SportHuman() {
            @Override
            public void train() {
                System.out.println("Футболист бьёт по мячу");
            }

            public static String doSomething() { // Нельзя вызвать
                return "Что то";
            }
        };

        soccerMan.train();

        SoccerMan soccerMan1 = new SoccerMan();
        soccerMan1.train();

        Swimmer swimmer1 = new Swimmer() {
            @Override
            public void train() {
                super.train();
            }
        };
        swimmer1.train();
    }
}
