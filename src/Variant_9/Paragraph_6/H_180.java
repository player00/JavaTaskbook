package Variant_9.Paragraph_6;

import static Helpers.HTools.readNatural;

import static java.lang.Math.abs;

public class H_180 {

    private static int run(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            double x = i * i * i - 3 * i * n * n + n;
            if (abs(x / 3 % 2) == 1) {
                sum += x;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + run(readNatural()));
    }

}
