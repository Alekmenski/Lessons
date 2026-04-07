package org;

import java.util.Scanner;

public class Prog13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= count; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
