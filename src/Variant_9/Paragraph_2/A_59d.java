package Variant_9.Paragraph_2;
/*Даны действительные числа x, y. Определить, принадлежит ли точка с координатами x, y заштрихованной части плоскости
        (рис.2, а - к).*/

import java.util.Scanner;

public class A_59d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y;

        System.out.println("Введите x");
        x = scan.nextDouble();
        System.out.println("Введите y");
        y = scan.nextDouble();

        if ((-0.5 <= x && x <= 0.5) || (-1 <= y && y <= 1)) {
            System.out.println("Условие выполняется");
        } else {
            System.out.println("Условие не выполняется");
        }


    }

}
