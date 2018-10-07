package Variant_9.Paragraph_3;

import static Helpers.HTools.readInt;

public class H_68v {

    private static boolean run(int n) {
        int x1 = n / 1000 % 10;
        int x2 = n / 100 % 10;
        int x3 = n / 10 % 10;
        int x4 = n % 10;

        return x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4;
    }

    public static void main(String[] args) {
        int n = readInt("Введите натуральное число", 0, 9999);

        System.out.println(run(n) ? "Все различны" : "Не все различны");
    }

}
