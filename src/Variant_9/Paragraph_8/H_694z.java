package Variant_9.Paragraph_8;

import Helpers.HTools;

public class H_694z {

    public static void main(String args[]) {
        int n = HTools.readNatural();
        int[][] a = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && i + j < n - 1) {
                    a[i][j] = 1;
                    a[n - 1 - i][j] = 1;
                } else {
                    a[i][j] = 0;
                    a[n - 1 - i][j] = 0;
                }
            }
        }

        HTools.showMatrix(a, n);
    }

}
