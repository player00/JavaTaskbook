package Helpers;

import java.util.Scanner;

public class HTools {
    private static Scanner in = new Scanner(System.in);

    private static double checkDouble(Scanner scn) {
        while (!scn.hasNextDouble()) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            scn.next();
        }
        return in.nextDouble();
    }

    private static int checkInt(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            scn.next();
        }
        return in.nextInt();
    }

    public static boolean isBetween(double min, double num, double max) {
        return min <= num && num <= max;
    }

    public static boolean isBetween(int min, int num, int max) {
        return min <= num && num <= max;
    }

    /**
     * Получает действетельное число с консоли.
     *
     * @return double
     */
    public static double readDouble() {
        System.out.println("Введите действетельное число");

        return checkDouble(in);
    }

    /**
     * Получает действетельное число с консоли.
     *
     * @param text Сообщение которое нужно вывести перед вводом
     * @return double
     */
    public static double readDouble(String text) {
        System.out.println(text);

        return checkDouble(in);
    }

    /**
     * Получает действетельное число с консоли.
     *
     * @param text Сообщение которое нужно вывести перед вводом
     * @param min  Минимальное допустимое
     * @param max  Максимальное допустимое
     * @return double
     */
    public static double readDouble(String text, double min, double max) {
        System.out.println(text + " в промежутке от " + min + " до " + max);

        double num = checkDouble(in);

        while (!isBetween(min, num, max)) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            num = in.nextDouble();
        }

        return num;
    }

    /**
     * Получает действетельное число с консоли.
     *
     * @return double
     */
    public static double readInt() {
        System.out.println("Введите целое число");

        return checkDouble(in);
    }

    /**
     * Получает целое число с консоли.
     *
     * @param text Сообщение которое нужно вывести перед вводом
     * @param min  Минимальное допустимое
     * @param max  Максимальное допустимое
     * @return double
     */
    public static int readInt(String text, int min, int max) {
        System.out.println(text + " в промежутке от " + min + " до " + max);

        int num = checkInt(in);

        while (!isBetween(min, num, max)) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            num = in.nextInt();
        }

        return num;
    }

    /**
     * Получает натуральное число с консоли.
     *
     * @return double
     */
    public static int readNatural() {
        System.out.println("Введите натуральное число");

        int num = checkInt(in);

        while (num < 1) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            num = in.nextInt();
        }

        return num;
    }
}
