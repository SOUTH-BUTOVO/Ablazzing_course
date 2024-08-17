package org.javaacademy.module1.lesson8.ex3;

// У нас есть лесорубка
// На лесорубке, есть лесоруб
// У лесоруба есть топор
// Топор обладает свойством - сломан или нет
// Если топор сломан, лесоруб не может рубить
// А лесорубка, зарабатывать деньги на рубке деревьев
// Если лесоруб пьян, то работать он не может.

public class Runner {
    public static void main(String[] args) {
        Axe axe = new Axe();
        Worker worker = new Worker(axe);
        Firm firm = new Firm(worker);

        firm.makeProfit();
        System.out.println("----------------");
//        axe.broken();
        worker.drink();
        firm.makeProfit();
    }
}
