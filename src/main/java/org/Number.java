package org;

import java.util.Scanner;
// выводит последнюю цифру
public class Number {
   public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       int num1 = scan.nextInt();
       int LastDight = getLastDight(num1);
       System.out.println(LastDight);

    }
    static int getLastDight(int num) {
       int num4 = num % 10;
       return num4;
    }
}

