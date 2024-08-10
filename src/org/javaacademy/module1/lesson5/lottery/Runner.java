package org.javaacademy.module1.lesson5.lottery;

public class Runner {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[2000];
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new Ticket();
        }
        Ticket lastTicket = tickets[1999];
        System.out.println("В 1 000 билете, сумма выиграша: " + lastTicket.getWinSum());
    }
}
