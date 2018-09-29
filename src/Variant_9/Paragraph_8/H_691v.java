package Variant_9.Paragraph_8;

import Helpers.HTools;

public class H_691v {

    public static void main(String args[]) {
        int n = 8;
        int[] a = new int[n * n];
        int[][] b = new int[n][n];
        String d = "u";

        for (int i = 0; i < n * n; i++) {
            a[i] = i + 1;
        }

        int i = 0, j = 0;

        b[i][j] = a[0];
        for (int k = 1; k < n * n; k++) {
            switch (d) {
                case "u":
                    if (i - 1 >= 0 && j + 1 < n) {
                        i--;
                        j++;
                    } else if (i == 0) {
                        j++;
                        d = "d";
                    } else {
                        i++;
                        d = "d";
                    }
                    break;
                case "d":
                    if (j - 1 >= 0 && i + 1 < n) {
                        j--;
                        i++;
                    } else if (j == 0 && i + 1 < n) {
                        i++;
                        d = "u";
                    } else {
                        j++;
                        d = "u";
                    }
                    break;
            }
            b[i][j] = a[k];

        }

        HTools.showMatrix(b, n);
    }

}
