package org;

import java.util.Scanner;
// Можно ли закрыть кругом квадратное отверстие
import static java.lang.Math.*;

public class Prog5 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону А: ");
        int kubA = scan.nextInt();
        System.out.println("Введите сторону В: ");
        int kubB = scan.nextInt();
        System.out.println("Введите радиус круга: ");
        int radius = scan.nextInt();
        int diagonalSquare = (kubA *kubA) + (kubB * kubB);
        int diametrSquare = (2 * radius) *(2 * radius);
        if (diametrSquare >= diagonalSquare) {
            System.out.println("Вашим кругом можно закрыть отверстие");
        } else {
            System.out.println("Вашим круком закрыть отверстие не получится");
        }

    }
}
