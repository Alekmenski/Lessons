package org;
// сумма квадратов чисел от 1 до N
import java.util.Scanner;

public class Kodred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число");
        int num = scanner.nextInt();
        int count = 0;
        if (num < 0) {
            num = -num;
        }
        for(int i = 1; i <= num; i++) {
            int numPOW = i * i;
            count = count +numPOW;
        }
        System.out.println(count);
    }
}
