package Array;
//Создаёт массив из 10 чисел: от 1 до 10
//Находит и выводит:
//Сумму всех чисел
//Среднее арифметическое
//Максимальное число
public class Array2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int count = 0;
        int numMax = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            count += array[i];
            System.out.print(array[i] + " ");
            if (numMax < array[i]) {
                numMax = array[i];
            }
        }
        System.out.println("\nСумма " + count);
        double averge = (double) count/array.length;
        System.out.println("Среднее арифметическое " + averge);
        System.out.println("Максимальное число " + numMax);

    }
}
