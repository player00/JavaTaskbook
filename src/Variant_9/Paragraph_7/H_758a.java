package Variant_9.Paragraph_7;

import Helpers.HTools;

public class H_758a {

    public static void main(String args[]) {
        double x = HTools.readDouble(), dif, sum = 0;
        double e = Math.pow(10, -6);

        dif = 1 / x * x * x;
        for (int k = 2; dif > e; k++) {
            dif = 1 / (x * x * x * k * k);
            sum += dif;
        }

        System.out.println("Сумма равна: " + sum);
    }

}
