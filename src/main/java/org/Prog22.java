package org;

import java.util.Scanner;

public class Prog22 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольного треугольника");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
