package Variant_9.Paragraph_4;

import Helpers.HTools;

public class H_78b {

    public static void main(String args[]) {
        double a;
        int n;

        a = HTools.readDouble();
        n = HTools.readNatural();

        double mul = a;
        for (int i = 1; i < n; i++) {
            mul *= a + i;
        }

        System.out.println("Произведение равно: " + mul);
    }

}
