package Variant_9.Paragraph_3;

import Helpers.HTools;

public class H_67d {

    public static void main(String args[]) {
        int n, x;

        n = HTools.readInt("Введите натуральное число", 10, 100);

        x = Math.floorDiv(n, 10);
        if (x > 10) {
            System.out.println(0);
        } else {
            System.out.println(x);
        }
    }

}
