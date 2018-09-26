package Helpers;

import java.util.Scanner;

public class STools {
    public static double readDouble(String text){
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        while(!in.hasNextDouble()){
            System.out.println("Введите число типа double");
            in.next();
        }
        return in.nextDouble();
    }
}
