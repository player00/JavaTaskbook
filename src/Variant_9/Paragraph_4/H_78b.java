package Variant_9.Paragraph_4;

import static Helpers.HTools.readDouble;
import static Helpers.HTools.readNatural;

public class H_78b {

    private static double run(double a, int n) {
        double mul = a;
        for (int i = 1; i < n; i++) {
            mul *= a + i;
        }

        return mul;
    }

    public static void main(String[] args) {
        double a = readDouble();
        int n = readNatural();

        System.out.println("Произведение равно: " + run(a, n));
    }

}
