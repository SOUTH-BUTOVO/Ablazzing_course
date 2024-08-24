package org.javaacademy.module1.lesson9.ex2;

public class Human {
    int mass = 33;

    private Hand leftHand = new Hand();
    private Hand rightHand = new Hand();

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public class Hand {
        int length = 10;

        public void go() {
            System.out.println("Пятюня");
        }
    }

    @Override
    public String toString() {
        return "Human" + "leftHand=" + leftHand + ", rightHand=" + rightHand;
    }
}
