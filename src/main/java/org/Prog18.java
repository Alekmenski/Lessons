package org;
// Записывает число в обратном порядке
import java.util.Scanner;

public class Prog18 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int orig = num;
        int reversed = 0;
        while (num != 0) {
            int num2 = num % 10;
            reversed = reversed * 10 +num2;
            num = num / 10;
        }
        if (orig == 0){
            System.out.println(0);

        }else {
            System.out.println(reversed);
        }

        }

    }
