package org;

import java.util.Scanner;
//Подставка правильного окончания
public class Prog7 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int money = scan.nextInt();
        rubl(money);



        }
        static  void rubl(int money1) {
            if (money1 % 10 == 5 || money1 % 10 == 0 || money1 >= 11 && money1 <= 14) {
                System.out.println("У вас осталось: " + money1 + " Рублей");
            } else if (money1 % 10 == 1) {
                System.out.println("У вас осталось: " + money1 + " Рубль");
            }else {
                System.out.println("У вас осталось: " + money1 + " Рубля");
            }

        }

}
