package Variant_9.Paragraph_2;

import Helpers.HTools;

public class H_59d {

    public static void main(String[] args) {
        double x, y;

        x = Math.abs(HTools.readDouble("Введите x"));
        y = Math.abs(HTools.readDouble("Введите y"));

        if (x <= 0.5 && y <= 1) {
            System.out.print("Принадлежит");
        } else {
            System.out.print("Не принадлежит");
        }
    }

}
