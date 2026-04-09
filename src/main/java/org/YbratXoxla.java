package org;
// Один штурмовик работал Z часов каждый последующий на 10 мин больше сколько работала бригада?
import java.util.Scanner;

public class YbratXoxla {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Сколько штурмовиков в бригаде?");
        int Shtyrmovik = scanner.nextInt();
        System.out.println("Сколько времени работал один штурмовик?");
        int timeOne = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= Shtyrmovik; i++) {
            timeOne = timeOne + 10;
        }
        System.out.println(timeOne);
    }
}
