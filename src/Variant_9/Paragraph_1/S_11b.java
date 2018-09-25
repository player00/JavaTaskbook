package Variant_9.Paragraph_1;

import java.util.Scanner;

public class S_11b {

    public static void main(String args[]){

        double x, y, z, a, b;

        Scanner in = new Scanner(System.in);

        System.out.print("x: ");
        while(!in.hasNextDouble()){
            System.out.println("Введите x в Double!");
            in.next();
        }
        x = in.nextDouble();

        System.out.print("y: ");
        while(!in.hasNextDouble()){
            System.out.println("Введите y в Double!");
            in.next();
        }
        y = in.nextDouble();

        System.out.print("z: ");
        while(!in.hasNextDouble()){
            System.out.println("Введите z в Double!");
            in.next();
        }
        z = in.nextDouble();

        a = (3 + Math.exp(y - 1)) / (1 + Math.pow(x, 2) * Math.abs(y - Math.tan(z)));
        b = 1 + Math.abs(y - x)+ (Math.pow(y - x, 2) / 2) + (Math.pow(Math.abs(y - x), 3) / 3);

        System.out.println("a = " + a + "; b = " + b + ";");

    }
}
