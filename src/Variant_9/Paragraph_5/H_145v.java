package Variant_9.Paragraph_5;

import Helpers.HTools;

public class H_145v {

    public static void main(String args[]) {
        int n = HTools.readNatural();
        double[] b = new double[n];

        for (int i = 1; i <= n; i++) {
            b[i-1] = i * i;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("b[" + (i + 1) + "]=" + b[i]);
        }
    }

}
