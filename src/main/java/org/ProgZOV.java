package org;

public class ProgZOV {
    public static void main(String[] args) {
        int heaght = 5;
        DrawZ(heaght);
        DrawO(heaght);
        DrawV(heaght);

    }
    public static void DrawZ (int heaght) {
        int widthZ = heaght;
        for (int i = 0; i < heaght; i++) {
             for (int j = 0; j < widthZ; j++) {
                if (i == 0 || i == heaght - 1) {
                System.out.print("*");
                } else if (j == widthZ - 1 - i) {
                System.out.print("*");
                } else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void DrawO (int heaght) {
        int widthO = heaght;
        for (int i = 0; i < heaght; i++) {
            for (int j = 0; j < widthO; j++) {
                if ((i == 0 || i == heaght -1) && j != 0 && j != widthO - 1 ) {
                    System.out.print("*");
                } else if (i != 0 && i != heaght - 1 && j == widthO - 1){
                    System.out.print("*");
                }else if (i != 0 && i != heaght - 1 && j == 0 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void DrawV (int heaght) {
        int widthV = heaght;
        for (int i = 0; i < heaght; i++) {
            for (int j = 0; j < widthV; j++) {
                if ( (i ==0 && j == 0) || (i ==0 && j == widthV-1)) {
                    System.out.print("*");
                } else if ((i == 1 && j == 0) || (i ==1 && j == widthV-i)) {
                    System.out.print("*");
                } else if ((i == 2 && j == 0) || (i == 2 && j == widthV -1)) {
                    System.out.print("*");
                } else if ((i == heaght - 2 && j ==1) || (i == heaght -2 && j == widthV - 2)) {
                    System.out.print("*");
                } else if (i== heaght - 1 && j ==(widthV -1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
