package Array;
//Создать двухмерный квадратный массив и заполнить его бабочкой

public class Array5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        arrayButerfy(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayButerfy(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0 || i == array.length - 1) {
                    array[i][j] = 1;
                } else if (i == array.length / 2) {
                    if (j == array.length / 2) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                } else {
                    int distanse = Math.abs(i - (array.length / 2));
                    if (j >= distanse && j <= array.length - 1 - distanse) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                }
            }
        }
    }
}
