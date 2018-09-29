package Variant_9.Paragraph_6;

import Helpers.HTools;

public class H_229 {

    public static void main(String args[]) {
        double x = HTools.readDouble("Введите x", 0);
        double y = HTools.readDouble("Введите y", 1);
        int k = 0;

        while (!(Math.pow(y, k - 1) <= x && x < Math.pow(y, k))) {
            k++;
        }

        System.out.println("Результат: " + k);
    }

}
