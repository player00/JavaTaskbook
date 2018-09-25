package Variant_9.Paragraph_1;

import java.util.Scanner;

public class H_09 {

    private static double readDouble(String text) {
        Scanner in = new Scanner(System.in);

        System.out.print(text + "\n");
        while (!in.hasNextDouble()) {
            System.out.print("Вы ввели не правильно, попробуйте повторить\n");
            in.next();
        }

        return in.nextDouble();
    }

    public static void main(String args[]) {

        double R = 0;

        for (int i = 1; i <= 3; i++) {
            R += 1 / readDouble("Введите сопротивление " + i);
        }

        System.out.print("Общее сопротивление = " + R);
    }

}
