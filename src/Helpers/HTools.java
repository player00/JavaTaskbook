package Helpers;

import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.round;

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
     * @return double
     */
    public static double readDouble(String text, double min) {
        System.out.println(text + " больше " + min);

        double num = checkDouble(in);

        while (num < min) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            num = in.nextDouble();
        }

        return num;
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
     * Получает целое число с консоли.
     *
     * @return int
     */
    public static int readInt() {
        System.out.println("Введите целое число");

        return checkInt(in);
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

    /**
     * Получает натуральное число с консоли.
     *
     * @return double
     */
    public static int readNatural(String text) {
        System.out.println(text);

        int num = checkInt(in);

        while (num < 1) {
            System.out.println("Вы ввели не правильно, попробуйте повторить");
            num = in.nextInt();
        }

        return num;
    }

    public static void showMatrix(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static long randomBetween(long a, long b) {
        return round(random() * (b - a) + a);
    }
}
