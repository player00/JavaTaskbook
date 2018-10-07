package Variant_9.Paragraph_6;

import static Helpers.HTools.readDouble;

public class H_229 {

    private static int run(double x, double y) {
        int k = 0;

        while (!(Math.pow(y, k - 1) <= x && x < Math.pow(y, k)) || !(Math.pow(y, -k - 1) <= x && x < Math.pow(y, -k))) {
            k++;
        }

        return k;
    }

    public static void main(String[] args) {
        double x = readDouble("Введите x", 0);
        double y = readDouble("Введите y", 1);

        System.out.println("Результат: " + run(x, y));
    }

}
