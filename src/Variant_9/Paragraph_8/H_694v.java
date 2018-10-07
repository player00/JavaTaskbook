package Variant_9.Paragraph_8;

import static Helpers.HTools.readNatural;
import static Helpers.HTools.showMatrix;

public class H_694v {

    private static int[][] run(int n) {
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            a[i][i] = n - i;
        }

        return a;
    }

    public static void main(String[] args) {
        int n = readNatural();

        showMatrix(run(n), n);
    }

}
