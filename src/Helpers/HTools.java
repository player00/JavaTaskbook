package Helpers;

import java.util.Scanner;

public class HTools {
    private static Scanner in = new Scanner(System.in);

    public static double readDouble(String text) {
        System.out.print(text + "\n");
        while (!in.hasNextDouble()) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            in.next();
        }

        return in.nextDouble();
    }
}
