package org.javaacademy.module1.lesson9.ex7;

public class Runner2 {
    public static void main(String[] args) {
        prtRecursion("abcde");
    }

    private static void prtRecursion(String str) {
        System.out.println(str);
        if (str.length() > 0) {
            prtRecursion(str.substring(0, str.length() - 1));
        }
    }
}
