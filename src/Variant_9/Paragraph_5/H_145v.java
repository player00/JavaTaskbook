package Variant_9.Paragraph_5;

import java.util.Arrays;

public class H_145v {

    private static long[] run() {
        int n = 20;
        long[] x = new long[n];

        x[0] = x[1] = x[2] = 1;

        for (int i = 3; i < n; i++) {
            x[i] = (i + 1 + 3) * (x[i - 2] - 1) + (i + 1 + 4) * x[i - 3];
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(run()));
    }

}
