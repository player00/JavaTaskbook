package Variant_9.Paragraph_6;

import Helpers.HTools;

public class H_194 {

    public static void main(String args[]) {
        int n = HTools.readNatural(), a = HTools.readInt(), sum = 0;
        long[] x = new long[n];
        boolean need = false;

        for (int i = 0; i < n; i++) {
            if (need) {
                sum += x[i];
            }
            x[i] = Math.round(Math.random() * 20 - 10);
            need = need || x[i] == a;
            System.out.printf("x[%2d] = %5d\n", i + 1, x[i]);
        }
        if (need) {
            System.out.println("Сумма равна: " + sum);
        }else {
            System.out.println("Сумма равна: -10");
        }
    }

}
