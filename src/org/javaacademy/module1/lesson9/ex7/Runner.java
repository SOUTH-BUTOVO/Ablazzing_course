package org.javaacademy.module1.lesson9.ex7;

public class Runner {
    public static void main(String[] args) {
        System.out.println(getSum(1_000));

        long res = 0;
        for (long i = 1; i <= 100_000; i++) {
            res = getSum(res, i);
        }
        System.out.println(res);
    }

    private static int getSum(int num) {
        if (num == 0) {
            return 0;
        }
        int res = num + getSum(num - 1);
        return res;
    }

    private static long getSum(long res, long increment) {
        return res + increment;
    }
}
