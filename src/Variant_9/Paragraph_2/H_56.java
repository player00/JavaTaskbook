package Variant_9.Paragraph_2;

import static Helpers.HTools.readDouble;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class H_56 {

    private static boolean run(double a, double b, double c, double x, double y) {
        double min = min(min(a, b), c);
        double max = max(max(a, b), c);
        double mid = a + b + c - max - min;

        return (min < min(x, y) && mid < max(x, y));
    }

    public static void main(String[] args) {
        double a = readDouble("Введите a");
        double b = readDouble("Введите b");
        double c = readDouble("Введите c");
        double x = readDouble("Введите x");
        double y = readDouble("Введите y");

        System.out.println(run(a, b, c, x, y) ? "Пройдёт" : "Не пройдёт");
    }

}
