package org;

import java.util.Scanner;

public class Sum {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int result = sumNum(num1);
        System.out.println(result);

    }
    static int sumNum (int num){
        int BackNum = num % 100;
        int FrontNum = num / 100;
        int SumNum = BackNum + FrontNum;
        return  SumNum;
    }
}
