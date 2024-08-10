package org.javaacademy.module1.lesson5.lottery;

public class Ticket {
    private static int ticketCount = 0;
    private int winSum = 0;

    public Ticket() {
        ticketCount++;
        if (ticketCount % 1000 == 0) {
            winSum = 1_000_000;
        }
    }

    public int getWinSum() {
        return winSum;
    }
}
