package Variant_9.Paragraph_5;

import static java.lang.Math.random;

public class H_163 {

    private static double[] run(double[] a) {
        double[] b = new double[37];

        boolean need = false;

        for (int i = 0; i < 37; i++) {
            need = need || (a[i] >= 0);

            b[i] = a[i] - (need ? 0.5 : 0);
        }

        return b;
    }

    public static void main(String[] args) {
        double[] a = new double[37], b;

        for (int i = 0; i < 37; i++) {
            a[i] = random() * 20 - 10;
        }

        b = run(a);

        for (int i = 0; i < 37; i++) {
            System.out.printf("a[%2d] = %5.2f b[%2d] = %.2f\n", i + 1, a[i], i + 1, b[i]);
        }
    }

}
