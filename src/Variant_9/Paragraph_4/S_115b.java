package Variant_9.Paragraph_4;

import Helpers.STools;

public class S_115b {

    public static void main(String[] args) {

        int n;
        double res = 0;

        n = STools.readNaturalNumber("Введите натуральное n: ");

        for (int k = 1; k <= n; k++){
            res += 1 / Math.pow(k, 5);
        }

        System.out.println("Результат: " + res);
    }
}
