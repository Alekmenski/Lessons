package Array;

//Создаёт массив из 5 чисел: {3, 6, 9, 12, 15}
//Выводит все элементы через пробел
//Выводит сумму всех элементов
public class Array1 {
    public static void main(String[] args) {
        int[] array = {3, 6, 9, 12, 15};
        int count = 0;

        for (int elements : array) {
            System.out.print(elements + " ");
            count = count + elements;
        }
        System.out.println();
        System.out.println("Сумма " + count);
    }
}
