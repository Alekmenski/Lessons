package org;

import java.util.Scanner;

public class Prog17 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int count = 0;
        if (a < 0) {
            a = -a;
        }
        while (a > 0) {
            int num = a % 10;
            count = count + num;
            a = a / 10;
        }
        System.out.println(count);
    }
}
