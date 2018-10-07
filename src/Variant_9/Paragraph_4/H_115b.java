package Variant_9.Paragraph_4;

import static Helpers.HTools.readNatural;

import static java.lang.Math.pow;

public class H_115b {

    private static double run(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1 / pow(i, 5);
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = readNatural("Введите натуральное число n");

        System.out.println("Сумма равна: " + run(n));
    }

}
