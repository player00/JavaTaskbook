package Variant_9.Paragraph_2;

import Helpers.HTools;

public class H_36 {

    public static void main(String[] args) {
        double a, b, c;

        a = HTools.readDouble("Введите a");
        b = HTools.readDouble("Введите b");
        c = HTools.readDouble("Введите c");

        if (a < b && b < c) {
            System.out.print("Неравенства выполняются");
        } else {
            System.out.print("Неравенства не выполняются");

        }
    }

}
