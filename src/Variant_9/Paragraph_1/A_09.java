package Variant_9.Paragraph_1;

import java.util.Scanner;

public class A_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double R1, R2, R3, R;

        System.out.println("Введите сопротивление R1");
        R1 = scan.nextDouble();
        System.out.println("Введите сопротивление R2");
        R2 = scan.nextDouble();
        System.out.println("Введите сопротивление R3");
        R3 = scan.nextDouble();
        R = 1 / R1 + 1 / R2 + 1 / R3;
        System.out.println("Обшее сопротивление R=" + R);
    }
}
