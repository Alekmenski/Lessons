package org;

public class Prog {
    public static void main(String[] args) {
       int promo = 980000;
       String realizas = time(promo);
       System.out.println(realizas);

    }

    static String time(int Time) {
        int week = Time / (7 * 24 * 3600);
        int day = (Time % (7 * 24 * 3600)) / (24 * 3600);
        int hours = (Time % (24 * 3600)) / 3600;
        int min= (Time % 3600) / 60;
        int sec = Time % 60;
        return "Неделя " + week + "Дней " + day + "часов " + hours + "минут " + min + "секунд " + sec;
    }

}
