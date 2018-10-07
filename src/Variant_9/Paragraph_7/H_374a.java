package Variant_9.Paragraph_7;

import Helpers.HTools;

import static Helpers.HTools.readNatural;

import static java.lang.Math.sin;

public class H_374a {

    private static int run(int n) {
        int count = 0;
        double[][] a = new double[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i - 1][j - 1] = sin(i + j / 2.0);
                if (a[i - 1][j - 1] > 0) {
                    count++;
                }
                System.out.printf("%5.2f ", a[i - 1][j - 1]);
            }
            System.out.println();
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(run(readNatural()) + " положительных элементов");
    }

}
