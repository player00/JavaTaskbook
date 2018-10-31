package Variant_9.Paragraph_2;
/* Даны действительные положительные числа a, b, c, x, y. Выяснить, пройдет ли кирпич с ребрами a, b, c в прямоугольное отверстие со сторонами x, y.
 Просовывать кирпич в отверстие разрешается только так, чтобы каждое из его ребер было параллельно или перпендикулярно каждой из сторон отверстия.*/

import java.util.Scanner;

public class A_56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, x, y;

        System.out.print("Введите a");
        a = scan.nextDouble();
        System.out.print("Введите b");
        b = scan.nextDouble();
        System.out.print("Введите c");
        c = scan.nextDouble();
        System.out.print("Введите x");
        x = scan.nextDouble();
        System.out.print("Введите y");
        y = scan.nextDouble();

        if ((a <= x && b <= y) || (a <= y && b <= x) || (b <= x && c <= y) || (b <= y && c <= x) || (a <= x && c <= y) || (a <= y && c <= x)) {
            System.out.print("Действие выполняется");
        } else {
            System.out.print("Действие не выполняется");
        }


    }


}
