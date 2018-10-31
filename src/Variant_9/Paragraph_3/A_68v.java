package Variant_9.Paragraph_3;
//Дано натуральное число n (n ≤ 9999).
//в) Верно ли, что все четыре цифры числа различны?

import java.util.Scanner;

public class A_68v {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n");
        int n = scan.nextInt();
        if (1 <= n && n <= 9999) {
            int a = n / 1000;
            int b = n / 100 % 10;
            int c = n / 10 % 10;
            int d = n % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                System.out.print("zbs");
            } else {
                System.out.println("huevo");
            }
        } else {
            System.out.println("false");
        }
    }
}
