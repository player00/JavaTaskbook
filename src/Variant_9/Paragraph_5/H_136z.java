package Variant_9.Paragraph_5;

import static Helpers.HTools.readDouble;
import static Helpers.HTools.readNatural;

public class H_136z {

    private static int fact(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }

        return fact;
    }

    private static double run(double[] a, int n) {
        double sum = 0;

        for (int sign = -1, i = 0; i < n; i++) {
            sum += (sign * a[i]) / fact(i);
            sign = -sign;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = readNatural();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = readDouble("Введите a[" + (i + 1) + "]");
        }

        System.out.println("Сумма равна: " + run(a, n));
    }

}
