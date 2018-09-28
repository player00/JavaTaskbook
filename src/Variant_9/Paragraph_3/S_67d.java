package Variant_9.Paragraph_3;

import Helpers.STools;

public class S_67d {

    public static void main(String[] args) {

        int n;

        n = STools.readNaturalNumber("Введите натуральное число от 10 до 100:", 10, 100);

        System.out.println("Предпоследняя цифра числа " + n + " - это " + n / 10 % 10);

    }
}
