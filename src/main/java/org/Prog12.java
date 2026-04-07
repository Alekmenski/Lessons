package org;

import java.util.Scanner;

public class Prog12 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество людей: ");
        int people = scan.nextInt();
        System.out.println("Введите количество кусков пиццы в одной коробке: ");
        int pizza = scan.nextInt();
        int count = 1;
        while ((count * pizza) / people == 0 ) {
            count++;
            }
        System.out.println("Количество пицц на " + people + " людей, составляет: " + count);
        }

    }


