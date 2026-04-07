package org;

import java.util.Scanner;

public class Prog15 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        if (number == 0) {
            result = 1;
        }
        else {
            while (number != 0) {
                number = number / 10;
                result++;
            }
        }
        System.out.println(result);
    }
}
