package Variant_9.Paragraph_2;

import static Helpers.HTools.readDouble;

public class H_55 {

    private static boolean run(double a, double b, double c, double d) {
        return (a <= c && b <= d) || (a <= d && b <= c);
    }

    public static void main(String[] args) {
        double a = readDouble("Введите a");
        double b = readDouble("Введите b");
        double c = readDouble("Введите c");
        double d = readDouble("Введите d");

        System.out.print(run(a, b, c, d) ? "Можно" : "Нельзя");
    }

}
