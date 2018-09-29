package Variant_9.Paragraph_4;

import Helpers.STools;

public class S_78b {

    public static void main(String[] args) {

        double a, res;
        int n;

        a = STools.readDouble("Введите действительное а: ");
        n = STools.readNaturalNumber("Введите натуральное n: ");
        res = a;

        for (int i = 1; i < n; i++){
            res *= a+i;
        }

        System.out.println("Результат: " + res);
    }
}
