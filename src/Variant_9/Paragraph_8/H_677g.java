package Variant_9.Paragraph_8;

import Helpers.HTools;

public class H_677g {

    public static void main(String args[]) {
        int n = HTools.readNatural();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int s = 0;
                int min = Math.min(i, j);
                int max = Math.max(i, j);
                for (int k = min; k <= max; k++) {
                    for (int z = min; z <= max; z++) {
                        s += a[k][z];
                    }
                }
                b[i][j] = s;
            }
        }

        HTools.showMatrix(a, n);
        HTools.showMatrix(b, n);
    }

}
