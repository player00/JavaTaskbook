package Variant_9.Paragraph_7;

import Helpers.STools;

public class S_763a {

    public static void main(String[] args) {
        double x, e, a1, a2 = 0;

        x = STools.readDouble("Введите действительное x: ");
        e = STools.readDouble("Введите действительное e: ", 0);

        a1 = x;

        for (int i = 0; i < 10000; i++) {
            a2 = Math.sqrt(Math.abs(4 * a1 * a1 - 2 * x));
            if (Math.abs(a2 - a1) < e)
                break;
            a1 = a2;
        }

        System.out.println("Первый член равен " + a2);
    }
}
