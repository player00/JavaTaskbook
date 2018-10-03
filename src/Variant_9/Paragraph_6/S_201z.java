package Variant_9.Paragraph_6;

import Helpers.STools;

import java.util.Arrays;

public class S_201z {

    public static void main(String[] args) {
        int n;
        double[] a;
        double[] sqr;

        n = STools.readNaturalNumber("Введите натуральное n ");
        a = new double[n];
        sqr = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = STools.readDouble("Введите a[" + i + "]");
            sqr[i] = a[i] * a[i];
        }
        Arrays.sort(a);
        Arrays.sort(sqr);

        System.out.println(a[0] * a[0] - sqr[0]);
    }
}
