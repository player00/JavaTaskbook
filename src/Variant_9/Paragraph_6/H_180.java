package Variant_9.Paragraph_6;

import Helpers.HTools;

public class H_180 {

    public static void main(String args[]) {
        int n = HTools.readNatural();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            double x = i * i * i - 3 * i * n * n + n;
            if ((Math.abs(x / 3 % 2) == 1) && (x % 3 == 0)) {
                sum += x;
            }
        }

        System.out.println("Сумма равна: " + sum);
    }

}
