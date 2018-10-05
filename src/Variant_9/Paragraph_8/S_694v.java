package Variant_9.Paragraph_8;

import Helpers.STools;

public class S_694v {

    public static void main(String[] args) {
        int[][] a;
        int n;

        n = STools.readNaturalNumber("Введите натуральное n:");
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    a[i][i] = n - i;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
