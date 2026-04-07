package org;

import java.util.Scanner;

public class Prog2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Ваше число: " + number);
        int threeNum = ThreeNumber(number);
        System.out.println("Третья цифра в вашем числе: " + threeNum);

    }
    static int ThreeNumber (int threeNum) {
        int num = (threeNum / 100) % 10;
        return num;
    }
}
