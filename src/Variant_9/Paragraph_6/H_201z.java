package Variant_9.Paragraph_6;

import static Helpers.HTools.readNatural;

import static java.lang.Math.*;

public class H_201z {

    private static double run(double[] a) {
        double min = a[0], min2 = pow(a[0], 2);

        for (int i = 1; i < a.length; i++) {
            a[i] = round(random() * 20 - 10);
            min = min(min, a[i]);
            min2 = min(min2, pow(a[i], 2));
        }

        return (min * min - min2);
    }

    public static void main(String[] args) {
        int n = readNatural();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = round(random() * 20 - 10);
            System.out.printf("x[%2d] = %5.2f\n", i + 1, a[i]);
        }

        System.out.println("Результат: " + run(a));
    }

}
