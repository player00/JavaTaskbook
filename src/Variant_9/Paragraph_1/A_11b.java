package Variant_9.Paragraph_1;

import java.util.Scanner;

public class A_11b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, z, a, b;
        System.out.println("Введите x");
        x = scan.nextDouble();
        System.out.println("Введите y");
        y = scan.nextDouble();
        System.out.println("Введите z");
        z = scan.nextDouble();
        a = (3 + Math.exp(y - 1)) / (1 + x * x * Math.abs(y - Math.tan(z)));
        System.out.println("a=" + a);
        b = 1 + Math.abs(x - y) + (Math.pow(x - y, 2) / 2) + (Math.pow(Math.abs(y - x), 3) / 3);
        System.out.println("b=" + b);
    }
}
