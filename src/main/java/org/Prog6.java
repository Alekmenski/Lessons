package org;

import java.util.Scanner;
// Вывод плана на день
public class Prog6 {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int DayNumber = scan.nextInt();
       String day = PlanWeek(DayNumber);
       System.out.println(day);

    }
    static String PlanWeek (int Day) {
        return switch (Day) {
            case 1 -> "В понедельник: \n Прогулка";
            case 2 -> "В вторник: \n уборка";
            case 3 -> "В среду: \n Готовка";
            case 4 -> "В четверг: \n работа";
            case 5 -> "В пятницу: \n пивко";
            case 6 -> "В субботу: \n отдых";
            case 7 -> "В воскресенье: \n подготовка к будням";
            default -> "Неуизвестный день";

        };
    }
    }
