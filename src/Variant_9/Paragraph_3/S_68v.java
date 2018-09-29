package Variant_9.Paragraph_3;

import Helpers.STools;

public class S_68v {

    public static void main(String[] args) {

        int n, n1, n2, n3, n4;

        n = STools.readNaturalNumber("Введите натуральное число меньше 10000: ", 9999);

        n1 = n % 10;
        n2 = n / 10 % 10;
        n3 = n / 100 % 10;
        n4 = n / 1000 % 10;

        if ((n1 != n2) && (n1 != n3) && (n1 != n4) && (n2 != n3) && (n2 != n4) && (n3 != n4))
            System.out.printf("В числе %04d нет повторяющихся цифр!",n);
        else
            System.out.printf("В числе %04d есть повторяющиеся цифры!",n);
    }
}
