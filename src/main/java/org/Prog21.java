package org;

import java.util.Scanner;

public class Prog21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        int a = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int b = scanner.nextInt();
        for (int i = 1; i <=b; i++) {
            for (int j = 1; j <= a; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}


