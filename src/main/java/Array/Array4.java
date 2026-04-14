package Array;

import java.util.Arrays;
import java.util.Random;

//Создайте переменную для массива из 10 элементов
// Заполните его произвольными значениями целочисленного типа
// Найдите максимальный элемент и вывидите его индекс
public class Array4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int numMax = 0;
        int numMaxIndex = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Рандомный массив - " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (numMax < array[i]) {
                numMax = array[i];
                numMaxIndex = i;
            }
        }
        System.out.println("Максимальное число в массиве - " + numMax);
        System.out.println("Индекс максимального числа - " + numMaxIndex);
    }
}
