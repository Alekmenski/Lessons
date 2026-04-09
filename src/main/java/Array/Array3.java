package Array;

import java.util.Arrays;
import java.util.Random;

// Создайте переменную для массива из 10 элементов
// Заполните его произвольными значениями целочисленного типа
// Выведите на экран элементы стоящие на четных позициях
public class Array3 {
    public static void main (String[] args) {
        int [] array = new int [10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Мой массив " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
