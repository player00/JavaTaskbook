package Variant_9.Paragraph_6;

import Helpers.HTools;

public class H_201z {

    public static void main(String[] args) {
        int n = HTools.readNatural();
        double[] a = new double[n];

        a[0] = Math.round(Math.random() * 20 - 10);
        double min = a[0], min2 = Math.pow(a[0], 2);

        for (int i = 1; i < n; i++) {
            a[i] = Math.round(Math.random() * 20 - 10);
            min = Math.min(min, a[i]);
            min2 = Math.min(min2, Math.pow(a[i], 2));
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%2d] = %5.2f\n", i + 1, a[i]);
        }

        System.out.println("Результат: " + (min * min - min2));
    }

}
