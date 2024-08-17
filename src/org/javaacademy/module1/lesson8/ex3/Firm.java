package org.javaacademy.module1.lesson8.ex3;

// Лесорубка
public class Firm {
    private Worker worker;

    public Firm(Worker worker) {
        this.worker = worker;
    }

    // Делаем прибыль, за счёт рубки деревьев
    void makeProfit() {
//        try {
//            worker.chop();
//            System.out.println("Заделали много деняг");
//        } catch (AxeIsBrokenException e) {
//            System.out.println("Не можем работать, по причине: " + e.getMessage());
//        } catch (WorkerIsDrunkException e) {
//            System.out.println("Не можем работать, по причине: " + e.getMessage());
//        }

        try {
            worker.chop();
        } catch (AxeIsBrokenException | WorkerIsDrunkException e) {
            System.out.println("Проблемы у сотрудника " + e.getMessage());
        }
        System.out.println("Заделали много денюжек");
    }
}
