package Variant_9.Paragraph_2;

import Helpers.HTools;

public class H_55 {

    public static void main(String args[]) {
        double a, b, c, d;

        a = HTools.readDouble("Введите a");
        b = HTools.readDouble("Введите b");
        c = HTools.readDouble("Введите c");
        d = HTools.readDouble("Введите d");

        if ((a <= c && b <= d) || (a <= d && b <= c)) {
            System.out.print("Можно");
        } else {
            System.out.print("Нельзя");
        }
    }

}
