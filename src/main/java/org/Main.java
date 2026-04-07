package org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Сколько денег хотите поменять?");
        double money1 = money.nextDouble();
        float exhange = 2.87f;
        char dollars = '$';
        System.out.println("Вот ваши деньги " + money1 / exhange +" " + dollars);
        int i = 5;
        int t = 10 + i++;
        System.out.println(t);

    }
}