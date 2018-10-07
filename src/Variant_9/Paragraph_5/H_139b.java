package Variant_9.Paragraph_5;

import java.util.Arrays;

import static Helpers.HTools.readNatural;

public class H_139b {

    private static int[] run(int n) {
        int[] b = new int[n];

        for (int i = 1; i <= n; i++) {
            b[i - 1] = i * i;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = readNatural();

        System.out.println(Arrays.toString(run(n)));
    }

}
