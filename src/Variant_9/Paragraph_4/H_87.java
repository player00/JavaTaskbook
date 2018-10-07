package Variant_9.Paragraph_4;

import static Helpers.HTools.readNatural;

public class H_87 {

    private static int run(int n, int m) {
        int sum = 0;

        for (int x = 1, i = 1; i <= m; i++) {
            x *= 10;
            sum += (n % x) / (x / 10);
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = readNatural("Введите натуральное число n");
        int m = readNatural("Введите натуральное число m");

        System.out.println("Сумма равна: " + run(n, m));
    }

}
