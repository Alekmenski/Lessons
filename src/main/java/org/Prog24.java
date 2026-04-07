package org;
//Числовая пирамида
import java.util.Scanner;

public class Prog24 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int count = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);

            }
            count++;
            System.out.println();
        }
    }
}
