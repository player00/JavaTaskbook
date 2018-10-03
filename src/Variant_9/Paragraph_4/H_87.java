package Variant_9.Paragraph_4;

import Helpers.HTools;

public class H_87 {

    public static void main(String[] args) {
        int n, m, sum = 0;

        n = HTools.readNatural("Введите натуральное число n");
        m = HTools.readNatural("Введите натуральное число m");

        for (int x = 1, i = 1; i <= m; i++) {
            x *= 10;
            sum += (n % x) / (x / 10);
        }

        System.out.println("Сумма равна: " + sum);
    }

}
