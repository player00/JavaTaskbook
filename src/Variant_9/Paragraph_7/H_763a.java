package Variant_9.Paragraph_7;

import Helpers.HTools;

public class H_763a {

    public static void main(String args[]) {
        double x = HTools.readDouble(), dif = 1, last = x, cur = x;
        double e = HTools.readDouble("Введите точность", 0);

        System.out.printf("a[0] = %5.2f\n", cur);
        for (int i = 1; i > 10000 || dif > e; i++) {
            cur = Math.sqrt(Math.abs(4 * last* last - 2 * x));
            dif = Math.abs(cur - last);
            last = cur;
            System.out.printf("a[%d] = %5.2f\n", i + 1, cur);
        }
    }

}
