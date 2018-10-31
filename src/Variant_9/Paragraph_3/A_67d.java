package Variant_9.Paragraph_3;
//Дано натуральное число n (n ≤ 100) d.  В предположении,
// что n ≥ 10, найти предпоследнюю цифру числа n

import java.util.Scanner;

public class A_67d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("n");
        n = scan.nextInt();
        if (10 <= n && n <= 10000) {
            System.out.println(n / 10 % 10);
        } else {
            System.out.println("false");
        }
    }
}
