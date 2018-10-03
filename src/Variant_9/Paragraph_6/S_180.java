package Variant_9.Paragraph_6;

import Helpers.STools;

public class S_180 {

    public static void main(String[] args) {
        int n, sum = 0;

        n = STools.readNaturalNumber("Введите натуральное число: ");

        for (int i = 1; i <= n; i++) {
            if (Math.abs((Math.pow(i, 3) - 3 * i * n * n + n) / 3 % 2) == 1) {
                sum += Math.pow(i, 3) - 3 * i * n * n + n;
            }
        }

        System.out.println("Сумма равна " + sum);
    }
}
