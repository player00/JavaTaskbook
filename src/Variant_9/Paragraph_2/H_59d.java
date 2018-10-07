package Variant_9.Paragraph_2;

import static Helpers.HTools.readDouble;

import static java.lang.Math.abs;

public class H_59d {

    private static boolean run(double x, double y) {
        x = abs(x);
        y = abs(y);

        return (x <= 0.5 && y <= 1);
    }

    public static void main(String[] args) {
        double x = readDouble("Введите x");
        double y = readDouble("Введите y");

        System.out.println(run(x, y) ? "Принадлежит" : "Не принадлежит");
    }

}
