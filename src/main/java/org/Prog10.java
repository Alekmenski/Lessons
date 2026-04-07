package org;

public class Prog10 {
    public static void main(String[] args) {
        int num = 1;
        int factorial = 1;
        while (num <= 10) {
 //           int factorial = 1;
//            int num1 = 1;
//            while (num1 <= num) {
//                factorial = factorial * num1;
//                num1++;
//            }
//            System.out.println(num + "! = " + factorial);
//            num++;
            factorial = factorial * num;
            System.out.println(num + "! = " + factorial);
            num++;
        }
    }
}
