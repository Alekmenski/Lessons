package Array;

import java.util.Arrays;

// Исключить одинаковые элементы массива каждое значение должно присуствывать в единичном экземпляре
public class Array6 {
    public static void main(String[] args) {
        int[] array = {5, 5, 6, 3, 1, 3};
        int[] array2 = new int[array.length];
        int index = 0;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            boolean contains = false;
            for (int y = i + 1; y < array.length; y++) {
                if(value == array[y]) {
                    contains = true;
                    break;
                }

            }
            if (!contains) {
                array2[index] = array[i];
                index++;
            }
        }
        int[] arrayResult = Arrays.copyOf(array2, index);
        System.out.println(Arrays.toString(arrayResult));
    }
}
