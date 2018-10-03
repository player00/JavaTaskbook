package Variant_9.Paragraph_4;

import Helpers.HTools;

public class H_115b {

    public static void main(String[] args) {
        int n;
        double sum = 0;

        n = HTools.readNatural("Введите натуральное число n");

        for (int i = 1; i <= n; i++) {
            sum += 1 / Math.pow(i, 5);
        }

        System.out.println("Сумма равна: " + sum);
    }

}
