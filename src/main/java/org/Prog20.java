package org;

public class Prog20 {
    public static void main (String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <=10; a++) {
                int num = i * a;
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
