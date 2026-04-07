package org;
// Выводит все четные числа от 1 до 100
public class Prog14 {
    public static void main (String[] args) {
        for (int i = 1; i<=100; i++) {
            if (i % 2 == 0) {
                System.out.print( i + "\t");
            }
        }
    }
}
