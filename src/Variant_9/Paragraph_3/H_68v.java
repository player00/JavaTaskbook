package Variant_9.Paragraph_3;

import Helpers.HTools;

public class H_68v {

    private static boolean check(int x1, int x2, int x3, int x4) {
        return x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4;
    }

    public static void main(String args[]) {
        int n, x1, x2, x3, x4;

        n = HTools.readInt("Введите натуральное число", 0, 9999);

        x1 = Math.floorMod(Math.floorDiv(n, 1000), 10);
        x2 = Math.floorMod(Math.floorDiv(n, 100), 10);
        x3 = Math.floorMod(Math.floorDiv(n, 10), 10);
        x4 = Math.floorMod(n, 10);

        if (check(x1, x2, x3, x4)) {
            System.out.println("Все различны");
        } else {
            System.out.println("Не все различны");
        }
    }

}
