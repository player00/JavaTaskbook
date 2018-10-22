package Variant_9.Paragraph_2;

import java.util.Scanner;

public class A_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;

        System.out.println("Введите a");
        a = scan.nextDouble();
        System.out.println("Введите b");
        b = scan.nextDouble();
        System.out.println("Введите c");
        c = scan.nextDouble();
        if ((a < b) && (b < c)) {
            System.out.println("Выполняется");
        } else {
            System.out.println("Не выполняется");
        }
    }
}
