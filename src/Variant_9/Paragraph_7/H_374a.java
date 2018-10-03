package Variant_9.Paragraph_7;

import Helpers.HTools;

public class H_374a {

    public static void main(String[] args) {
        int n = HTools.readNatural(), count = 0;
        double[][] a = new double[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i - 1][j - 1] = Math.sin(i + j / 2.0);
                if(a[i - 1][j - 1] >0){
                    count++;
                }
                System.out.printf("%5.2f ", a[i - 1][j - 1]);
            }
            System.out.println();
        }

        System.out.println(count + " положительных элементов");
    }

}
