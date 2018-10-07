package Variant_9.Paragraph_8;

import static Helpers.HTools.readNatural;
import static Helpers.HTools.showMatrix;

public class H_694z {

    private static int[][] run(int n) {
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

        return a;
    }

    public static void main(String[] args) {
        int n = readNatural();

        showMatrix(run(n), n);
    }

}
