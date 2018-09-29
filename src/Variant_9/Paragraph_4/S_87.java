package Variant_9.Paragraph_4;

import Helpers.STools;

public class S_87 {

    public static void main(String[] args) {

        int n, m, sum = 0;

        n = STools.readNaturalNumber("Введите натуральное n: ");
        m = STools.readNaturalNumber("Введите натуральное m: ");

        for (int i = 0; i < m; i++){
            sum += n / Math.pow(10, i) % 10;
        }

        System.out.println("Сумма последних " + m + " цифр числа " + n + " равна " + sum);
    }
}
