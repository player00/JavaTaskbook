package Variant_9.Paragraph_3;
// Дано натуральное число n (n ≤ 100), определяющее возраст человека (в годах). Дать для этого числа наименования «год», «года» или «лет»: например, 1 год, 23 года, 45 лет и т. д.


import java.util.Scanner;

public class A_74 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;

        System.out.println("Введите возраст");
        n = scan.nextInt();
        System.out.print(n + " ");

        if (1 <= n && n <= 100) {
            m = n % 10;
            if ((11 <= n && n <= 14) || 5 <= m || m == 0) {
                System.out.println("лет");
            } else {
                if (m == 1) {
                    System.out.println("год");
                } else {
                    System.out.println("года");
                }
            }
        } else {
            System.out.println("Мертв");
        }
    }

}
