package org;

import java.util.Scanner;

public class ProgBank {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Под какой процент хотите положить?");
        double percent = scanner.nextDouble();
        System.out.println("Какую сумму хотите положить под " + percent + " % ?");
        int money = scanner.nextInt();
        System.out.println("На сколько месяцев ?");
        int years = scanner.nextInt();
        for (int i = 1; i <= years; i++) {
            double income = money * Math.pow (1 + ((percent/100)/12), i);
            if ( i == 1) {
                System.out.println("Ваш доход за " + i + "  год составят - " + income);
            } else if ( i <= 4) {
                System.out.println("Ваш доход за " + i + "  года составят - " + income);
            } else {
                System.out.println("Ваш доход за " + i + "  лет составят - " + income);
            }
        }
    }
}
