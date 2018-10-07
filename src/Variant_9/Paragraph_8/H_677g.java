package Variant_9.Paragraph_8;

import static Helpers.HTools.showMatrix;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class H_677g {

    private static final int N = 8;

    private static int[][] run(int[][] a) {
        int[][] b = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int s = 0;
                int min = min(i, j);
                int max = max(i, j);
                for (int k = min; k <= max; k++) {
                    for (int z = min; z <= max; z++) {
                        s += a[k][z];
                    }
                }
                b[i][j] = s;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        int[][] a = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = 1;
            }
        }

        showMatrix(a, N);
        showMatrix(run(a), N);
    }

}
