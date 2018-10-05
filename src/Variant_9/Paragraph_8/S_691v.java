package Variant_9.Paragraph_8;

import java.util.Random;

public class S_691v {

    public static void main(String[] args) {
        double[][] a = new double[8][8];
        double[][] b = new double[8][8];
        int k = 0, l = 0;
        boolean goDown = false, goUp = false;
        Random random = new Random();


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = Math.round(random.nextDouble() * 1000.0) / 100.0;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                b[i][j] = a[k][l];
                System.out.print("a[" + k + "][" + l + "] ");

                if (((k == 0) || (k == 7)) && (l % 2 == 0)) {
                    l++;
                } else if ((k == 0) && (l % 2 == 1)) {
                    goDown = true;
                    goUp = false;
                    k++;
                    l--;
                } else if ((k == 7) && (l % 2 == 1)) {
                    goDown = false;
                    goUp = true;
                    k--;
                    l++;
                } else if (((l == 0) || (l == 7)) && (k % 2 == 1)) {
                    k++;
                } else if ((l == 0) && (k % 2 == 0)) {
                    goDown = false;
                    goUp = true;
                    k--;
                    l++;
                } else if ((l == 7) && (k % 2 == 0)) {
                    goDown = true;
                    goUp = false;
                    k++;
                    l--;
                } else if (goDown) {
                    k++;
                    l--;
                } else if (goUp) {
                    k--;
                    l++;
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
