package Variant_9.Paragraph_8;

import Helpers.HTools;

    public class H_694v {

    public static void main(String args[]) {
        int n = HTools.readNatural();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            a[i][i] = n - i;
        }

        HTools.showMatrix(a, n);
    }

}
