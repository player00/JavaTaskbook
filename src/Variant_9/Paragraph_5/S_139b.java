package Variant_9.Paragraph_5;

import Helpers.STools;

public class S_139b {

    public static void main(String[] args) {

        int n;
        int[] b;

        n = STools.readNaturalNumber("Введите n: ");
        b = new int[n];

        for (int i = 1; i <= n; i++) {
            b[i - 1] = i * i;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}
