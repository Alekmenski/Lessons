package org;

import java.util.Scanner;
// проверка на четное число
public class IsEven {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int num1 = scan.nextInt();
        boolean rezalts = isEven(num1);
        System.out.println(rezalts);
    }
    static boolean isEven( int num2) {
        boolean isEven = (num2 % 2) == 0;
        return isEven; //возвращение метода
    }
}
