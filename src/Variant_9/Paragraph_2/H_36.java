package Variant_9.Paragraph_2;

import static Helpers.HTools.readDouble;

public class H_36 {

    private static boolean run(double a, double b, double c) {
        return (a < b && b < c);
    }

    public static void main(String[] args) {
        double a = readDouble("Введите a");
        double b = readDouble("Введите b");
        double c = readDouble("Введите c");

        System.out.println("Неравенства" + (run(a, b, c) ? "" : " не ") + "выполняются");
    }

}
