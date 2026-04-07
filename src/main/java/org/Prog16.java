package org;
//Выводит таблицу умножения для числа 5
public class Prog16 {
    public static void main (String[] args) {
        int num = 5;
        for (int i = 1; i<=10; i++) {
           int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
