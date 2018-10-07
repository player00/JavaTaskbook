package Variant_9.Paragraph_1;

import static Helpers.HTools.readDouble;

import static java.lang.Math.exp;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.tan;

public class H_11b {

    private static double[] run(double x, double y, double z) {
        double a = (3 + exp(y - 1)) / (1 + x * x * abs(y - tan(z)));
        double b = 1 + abs(y - x) + pow(y - x, 2) / 2 + pow(abs(y - x), 3) / 3;

        return new double[]{a, b};
    }

    public static void main(String[] args) {
        double x = readDouble("Введите x");
        double y = readDouble("Введите y");
        double z = readDouble("Введите z");

        double[] res = run(x, y, z);

        System.out.printf("a = %5.2f b = %5.2f", res[0], res[1]);
    }

}
