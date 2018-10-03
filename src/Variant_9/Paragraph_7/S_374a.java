package Variant_9.Paragraph_7;

import Helpers.STools;

public class S_374a {

    public static void main(String[] args) {
        int n, k = 0;
        double[][] a;

        n = STools.readNaturalNumber("Введите натуральное n: ");
        a = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin(i + j / 2);
                if (a[i][j] > 0)
                    k++;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Количество положительных элементов равно " + k);
    }
}
