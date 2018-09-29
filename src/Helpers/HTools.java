package Helpers;

import java.util.Scanner;

public class HTools {
    private static Scanner in = new Scanner(System.in);

    /**
     * Получает рациональное число с консоли.
     *
     * @param text Сообщение которое нужно вывести перед вводом
     * @return double
     */
    public static double readDouble(String text) {
        System.out.println(text);
        while (!in.hasNextDouble()) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            in.next();
        }

        return in.nextDouble();
    }

    /**
     * Получает рациональное число с консоли.
     *
     * @param text Сообщение которое нужно вывести перед вводом
     * @param min Минимальное допустимое
     * @param max Максимальное допустимое
     * @return double
     */
    public static double readDouble(String text, double min, double max) {
        System.out.println(text + " в промежутке от " + min + " до " + max);
        while (!in.hasNextDouble()) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            in.next();
        }

        double num = in.nextDouble();

        while (!(min <= num && num <= max)) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            num = in.nextDouble();
        }

        return num;
    }

    /**
     * Получает целое число с консоли.
     *
     * @param text Сообщение которое нужно вывести перед вводом
     * @param min Минимальное допустимое
     * @param max Максимальное допустимое
     * @return double
     */
    public static int readInt(String text, int min, int max) {
        System.out.println(text + " в промежутке от " + min + " до " + max);
        while (!in.hasNextInt()) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            in.next();
        }

        int num = in.nextInt();

        while (!(min <= num && num <= max)) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            num = in.nextInt();
        }

        return num;
    }
}
