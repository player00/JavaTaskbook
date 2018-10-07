package Variant_9.Paragraph_7;

import static Helpers.HTools.readDouble;
import static java.lang.Math.pow;

public class H_758a {

    private static double run(double x) {
        double dif, sum = 0;
        double e = pow(10, -6);

        dif = 1 / x * x * x;
        for (int k = 2; dif > e; k++) {
            dif = 1 / (x * x * x * k * k);
            sum += dif;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + run(readDouble()));
    }

}
