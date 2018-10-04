package Variant_9.Paragraph_8;

import Helpers.STools;

public class S_694z {

    public static void main(String[] args) {
        int[][] a;
        int n;
        int k, l;

        n = STools.readNaturalNumber("Введите натуральное n:");
        a = new int[n][n];

        k = 0;
        l = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= k) && (j <= l)) {
                    a[i][j] = 1;
                }
            }
            k++;
            l--;
        }

        k = 0;
        l = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if ((j >= k) && (j <= l)) {
                    a[i][j] = 1;
                }
            }
            k++;
            l--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
