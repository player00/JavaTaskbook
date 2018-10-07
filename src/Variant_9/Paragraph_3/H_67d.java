package Variant_9.Paragraph_3;

import static Helpers.HTools.readInt;

public class H_67d {

    private static int run(int n) {
        int x = n / 10;

        return (x > 10 ? 0 : x);
    }

    public static void main(String[] args) {
        int n = readInt("Введите натуральное число", 10, 100);

        System.out.println(run(n));
    }

}
