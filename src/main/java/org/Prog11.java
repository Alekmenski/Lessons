package org;
// Выводит второе простое число от 50 до 70
public class Prog11 {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 50; num <= 70; num++) {
            boolean IsNum = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    IsNum = false;
                    break;
                }
            }
            if (IsNum && num > 1) {
                count++;
                if (count == 2) {
                    System.out.println("Второе простое число в интервале от 50 до 70: " + num);
                    break;
                }
            }
        }

    }
}