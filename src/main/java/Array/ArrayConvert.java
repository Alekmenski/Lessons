package Array;

//Из массива 1, перенесите все цифры в массив 2 в обратном порядке
public class ArrayConvert {
    public static void main(String[] args) {
        int[] array = new int[10];
        int [] arrayConvert = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            arrayConvert[i] = array[array.length - 1 - i];
            System.out.print(arrayConvert[i] + " ");
        }
    }
}
