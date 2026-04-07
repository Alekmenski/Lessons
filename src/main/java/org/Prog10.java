package org;
// Вычисляет факториал от 1 до 10
public class Prog10 {
    public static void main(String[] args) {
        int num = 1;
        int factorial = 1;
        while (num <= 10) {
            factorial = factorial * num;
            System.out.println(num + "! = " + factorial);
            num++;
        }
    }
}
