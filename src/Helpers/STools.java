package Helpers;

import java.util.Scanner;

public class STools {

    public static double readDouble(String text){
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        while(!in.hasNextDouble()){
            System.out.println("Введите число типа double!");
            in.next();
        }
        return in.nextDouble();
    }

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
