package Variant_9.Paragraph_1;

import Helpers.HTools;

public class H_24 {

    public static void main(String[] args) {

        double x1, y1, x2, y2, r;

        x1 = HTools.readDouble("Введите x1");
        y1 = HTools.readDouble("Введите y1");
        x2 = HTools.readDouble("Введите x2");
        y2 = HTools.readDouble("Введите y2");

        r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Расстояние = " + r);
    }

}
