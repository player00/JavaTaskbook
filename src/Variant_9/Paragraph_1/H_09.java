package Variant_9.Paragraph_1;

import static Helpers.HTools.readDouble;

public class H_09 {

    private static double run(double r1, double r2, double r3) {
        return 1 / r1 + 1 / r2 + 1 / r3;
    }

    public static void main(String[] args) {
        double R = 0;

        for (int i = 1; i <= 3; i++) {
            R += 1 / readDouble("Введите сопротивление " + i);
        }

        System.out.print("Общее сопротивление = " + R);
    }

}
