package Variant_9.Paragraph_1;

import java.util.Scanner;
//Вычислить расстояние между двумя точками с координатами x1, y1 и x2, y2.

public class A_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1, y1, x2, y2, S;

        System.out.println("Введите x1");
        x1 = scan.nextDouble();
        System.out.println("Введите y1");
        y1 = scan.nextDouble();
        System.out.println("Введите x2");
        x2 = scan.nextDouble();
        System.out.println("Введите y2");
        y2 = scan.nextDouble();
        S = Math.sqrt(Math.pow( x2 - x1, 2 ) + Math.pow( y2 - y1, 2 ));
        System.out.println("Расстояние S=" + S);
    }
}
