package org;

import java.util.Scanner;

public class Prog4 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean number = seven(num);
        System.out.println(number);

    }
    static boolean seven (int num1) {
        if (num1 % 10 == 7) {
            System.out.println("Все верно в вашем числе последняя цифра 7");
            return true;

        } else {
            System.out.println("Не правильно введено число");
            return false;
        }

    }

}
