package Variant_9.Paragraph_2;

import java.util.Scanner;

/*
 Даны действительные положительные числа a, b, c, d. Выяснить можно ли прямоугольник со сторонами a, b уместить внутри прямоугольника со сторонами c, d так,
 чтобы каждая из сторон одного прчмоугольника была параллельна или перпендикулярна каждой стороне второго прямоугольника.
 */
public class A_55 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, d;

        System.out.println("Введите а");
        a = scan.nextDouble();
        System.out.println("Введите b");
        b = scan.nextDouble();
        System.out.println("Введите c");
        c = scan.nextDouble();
        System.out.println("Введите d");
        d = scan.nextDouble();

        if ((a <= c && b <= d) || (a <= d && b <= c)){
            System.out.println("Условие выполняется");
        }
        else {
            System.out.println("Условие не выполняется");
        }

    }
}
