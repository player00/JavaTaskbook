package Variant_9.Paragraph_1;

import static Helpers.HTools.readDouble;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class H_24 {

    private static double run(double x1, double y1, double x2, double y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double x1 = readDouble("Введите x1");
        double y1 = readDouble("Введите y1");
        double x2 = readDouble("Введите x2");
        double y2 = readDouble("Введите y2");

        System.out.println("Расстояние = " + run(x1, y1, x2, y2));
    }

}
