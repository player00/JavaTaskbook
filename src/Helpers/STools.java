package Helpers;

import java.util.Scanner;

public class STools {

    /**
     * Метод для ввода действительного числа
     *
     * @param text Сообщение перед вводом
     * @return double
     */
    public static double readDouble(String text){
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        while(!in.hasNextDouble()){
            System.out.println("Введите число типа double!");
            in.next();
        }
        return in.nextDouble();
    }

    /**
     * Метод для ввода натурального числа
     *
     * @param text Сообщение перед вводом
     * @return int
     */
    public static int readNaturalNumber(String text){
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.println(text);
            while (!in.hasNextInt()) {
                System.out.println("Это не число!");
                in.next();
            }
            number = in.nextInt();
        } while (number <= 0);
        return number;
    }

    /**
     * Метод для ввода натурального числа с верхней границей
     *
     * @param text Сообщение перед вводом
     * @param max Верхняя граница вводимого числа
     * @return int
     */
    public static int readNaturalNumber(String text, int max){
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.println(text);
            while (!in.hasNextInt()) {
                System.out.println("Это не число!");
                in.next();
            }
            number = in.nextInt();
        } while ((number <= 0) || (number > max));
        return number;
    }

    /**
     * Метод для ввода натурального числа в заданном диапазоне
     *
     * @param text Сообщение перед вводом
     * @param min Нижняя граница диапазона
     * @param max Верхняя граница диапазона
     * @return int
     */
    public static int readNaturalNumber(String text, int min, int max){
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.println(text);
            while (!in.hasNextInt()) {
                System.out.println("Это не число!");
                in.next();
            }
            number = in.nextInt();
        } while ((number <= 0) || (number > max) || (number < min));
        return number;
    }
}
