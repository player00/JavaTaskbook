package Variant_9.Paragraph_2;

import Helpers.HTools;

public class H_56 {

    public static void main(String args[]) {
        double a, b, c, x, y;
        double min,mid,max;

        a = HTools.readDouble("Введите a");
        b = HTools.readDouble("Введите b");
        c = HTools.readDouble("Введите c");
        x = HTools.readDouble("Введите x");
        y = HTools.readDouble("Введите y");

        min = Math.min(Math.min(a, b), c);
        max = Math.max(Math.max(a, b), c);
        mid = a + b + c - max - min;

        if (min < Math.min(x, y) && mid < Math.max(x, y)) {
            System.out.print("Пройдёт");
        } else {
            System.out.print("Не пройдёт");
        }
    }

}
