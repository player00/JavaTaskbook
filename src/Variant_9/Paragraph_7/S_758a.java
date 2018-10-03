package Variant_9.Paragraph_7;

import Helpers.STools;

public class S_758a {

    public static void main(String[] args) {
        double x, e = 0.000001, sum1 = 0, sum2 = 0;

        x = STools.readDouble("Введите действительное x: ");

        for (int k = 1; k < Integer.MAX_VALUE; k++) {
            sum2 = sum1;
            sum1 += 1 / (x * x * x * k * k);
            if (Math.abs(sum1 - sum2) < e) {
                break;
            }
        }

        System.out.println(sum1);
    }
}
