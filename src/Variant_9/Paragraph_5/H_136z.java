package Variant_9.Paragraph_5;

import Helpers.HTools;

public class H_136z {

    private static int fact(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = HTools.readNatural();
        double sum = 0;
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = HTools.readDouble("Введите a[" + (i + 1) + "]");
        }

        for (int sign = -1, i = 0; i < n; i++) {
            sum += (sign * a[i]) / fact(i);
            sign = -sign;
        }

        System.out.println("Сумма равна: " + sum);
    }

}
