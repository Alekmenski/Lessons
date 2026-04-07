package org;

public class Prog9 {
    public static void main(String[] args) {
        long num = 7893823445L;
        long sum = 0;
        do {
            long LastNum = num % 10;
            sum = sum + LastNum;
            num = num / 10;
        } while (num > 0);
        System.out.println(sum);
    }
}

