package org;

import java.util.Scanner;

public class Temp {
    public static void main (String[] args) {
        Scanner celsiu = new Scanner(System.in);
        System.out.println("Сколько у вас температры по Цельсию");
        double celsiu1 = celsiu.nextInt();
        double faringeit = (celsiu1 * 9/5)+32;
        System.out.println("В фарингейтах = " + faringeit);

    }

}
