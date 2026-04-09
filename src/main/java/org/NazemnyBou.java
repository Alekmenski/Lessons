package org;
//Захват территорий
import java.util.Scanner;

public class NazemnyBou {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину территории");
        int lenghtTerritory = scanner.nextInt();
        System.out.println("Сколько меторов надо захватить?");
        int lenghtplus = scanner.nextInt();
        System.out.println("Сколько раз?");
        int count = scanner.nextInt();
        int zaxvat = lenghtplus;

        for (int i = 2; i <= count; i++) {
            lenghtplus = lenghtplus + zaxvat;

        }
        if (lenghtplus > lenghtTerritory) {
            System.out.println("Да ты заебал! Нет столько территорий");
        }else if (lenghtplus == lenghtTerritory) {
            System.out.println("Поздравляю у противника не осталось территорий, мы захватили все - " + lenghtplus + "м");
        } else {
            System.out.println("Мы захватили - " + lenghtplus + "м");
            System.out.println("Осталось территорий - " + (lenghtTerritory - lenghtplus + "м"));
        }
    }

}
