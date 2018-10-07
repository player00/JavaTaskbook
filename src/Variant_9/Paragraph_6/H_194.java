package Variant_9.Paragraph_6;

import static Helpers.HTools.readInt;
import static Helpers.HTools.readNatural;
import static java.lang.Math.random;
import static java.lang.Math.round;

public class H_194 {

    private static int run(int a, int n) {
        int sum = 0;
        long[] x = new long[n];
        boolean need = false;

        for (int i = 0; i < n; i++) {
            if (need) {
                sum += x[i];
            }
            x[i] = round(random() * 20 - 10);
            need = need || (x[i] == a);
            System.out.printf("x[%2d] = %5d\n", i + 1, x[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + run(readInt(), readNatural()));
    }

}
