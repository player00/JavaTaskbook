package Variant_9.Paragraph_5;

import Helpers.STools;

public class S_136z {

    public static void main(String[] args) {

        int n;
        double res = 0;
        double[] a;

        n = STools.readNaturalNumber("Введите натуральное n: ");
        a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = STools.readDouble("Введите a[" + i + "]");
        }

        for (int i = 1; i <= n; i++) {
            res += Math.pow(-1.0, i) * a[i - 1] / STools.factorial(i);
        }

        System.out.println("Результат: " + res);
    }
}
