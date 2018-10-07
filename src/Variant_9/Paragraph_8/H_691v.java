package Variant_9.Paragraph_8;

import static Helpers.HTools.showMatrix;

public class H_691v {

    private static final int N = 8;

    private static int[][] run(int[] a) {
        int[][] b = new int[N][N];
        String d = "u";

        int i = 0, j = 0;

        b[i][j] = a[0];
        for (int k = 1; k < N * N; k++) {
            switch (d) {
                case "u":
                    if (i - 1 >= 0 && j + 1 < N) {
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
                    if (j - 1 >= 0 && i + 1 < N) {
                        j--;
                        i++;
                    } else if (j == 0 && i + 1 < N) {
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

        return b;
    }

    public static void main(String[] args) {
        int[] a = new int[N * N];

        for (int i = 0; i < N * N; i++) {
            a[i] = i + 1;
        }

        showMatrix(run(a), N);
    }

}
