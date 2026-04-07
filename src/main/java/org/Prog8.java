package org;

import java.util.Scanner;
// Решение квадратонго уравнения
public class Prog8 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Нам предстоит решить квадратное уравнение  ax2 + bx + c = 0");
        System.out.println("Введите а:");
        int a = scan.nextInt();
        System.out.println("Введите b:");
        int b = scan.nextInt();
        System.out.println("Введите c:");
        int c = scan.nextInt();
        discrimenant(a, b, c);
    }
    static void discrimenant (int a, int b, int c) {
        int D = (b * b) - 4 * a * c;
        if (D > 0) {
            System.out.println("Дискриминант" + D + " больше нуля, значит уравнение имеет два корня:" + Math.sqrt(D));
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            System.out.println("Дискриминант" + D + " равен нулю, значит уравнение имеет один корень:");
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        }else {
            System.out.println("Дискриминант" + D + " меньше нуля, значит уравнение не имеет корней");
        }
    }
}
