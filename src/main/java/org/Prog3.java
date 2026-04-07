package org;
// Растояние между точками А и В
public class Prog3 {
    public static void main (String[] args) {
        int x1 = 3;
        int y1 = 2;
        int x2 = 5;
        int y2 = 8;
        double distans = Dxy(x1, y1, x2, y2);
        System.out.println(distans);
    }
    static double Dxy(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        double Dxy = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return Dxy;
    }

}
