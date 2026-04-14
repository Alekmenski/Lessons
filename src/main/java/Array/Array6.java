package Array;

import java.util.Arrays;

// Исключить одинаковые элементы массива каждое значение должно присуствывать в единичном экземпляре
public class Array6 {
    public static void main(String[] args) {
        int[] array = {5, 5, 6, 3, 1, 3};
        int[] array2 = new int[array.length];
        int arrayCount = 0;
        int arrayCount2 = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            arrayCount = array[i];
            for (int j = 0; j < array2.length; j++) {
                arrayCount2 = array2[j];
                if (arrayCount != arrayCount2) {
                    System.out.print( arrayCount + " ");
                }else {
                    System.out.print("0" + " ");
                }
            }
        }
    }
}
