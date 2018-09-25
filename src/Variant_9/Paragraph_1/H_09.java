package Variant_9.Paragraph_1;

import Helpers.HTools;

public class H_09 {

    public static void main(String args[]) {

        double R = 0;

        for (int i = 1; i <= 3; i++) {
            R += 1 / HTools.readDouble("Введите сопротивление " + i);
        }

        System.out.print("Общее сопротивление = " + R);
    }

}
