package Variant_9.Paragraph_8;

import Helpers.STools;

import java.util.Random;

public class S_677g {

    public static void main(String[] args) {
        int n;
        double[][] a, b;
        double temp;
        Random random = new Random();

        n = STools.readNaturalNumber("Введите натуральное n: ");
        a = new double[n][n];
        b = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.round(random.nextDouble() * 1000.0) / 100.0;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp = 0;
                if (i > j) {
                    for (int k = j; k <= i; k++) {
                        for (int l = j; l <= i; l++) {
                            temp += a[k][l];
                        }
                    }
                } else {
                    for (int k = i; k <= j; k++) {
                        for (int l = i; l <= j; l++) {
                            temp += a[k][l];
                        }
                    }
                }
                b[i][j] = Math.round(temp * 100.0) / 100.0;
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
