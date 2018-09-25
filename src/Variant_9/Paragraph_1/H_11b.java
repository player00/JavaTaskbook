package Variant_9.Paragraph_1;

import Helpers.HTools;

public class H_11b {

    public static void main(String args[]) {

        double x, y, z, a, b;

        x = HTools.readDouble("Введите x");
        y = HTools.readDouble("Введите y");
        z = HTools.readDouble("Введите z");

        a = (3 + Math.exp(y - 1)) / (1 + x * x * Math.abs(y - Math.tan(z)));
        b = 1 + Math.abs(y - x) + Math.pow(y - x, 2) / 2 + Math.pow(Math.abs(y - x), 3) / 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
