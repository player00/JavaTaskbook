package Sergei.paragraph_1;

import java.util.Scanner;

public class task_9 {

    public static void main(String args[]){

        double R1, R2, R3, R;

        Scanner in = new Scanner(System.in);

            System.out.print("Введите первое сопротивление: ");
            while(!in.hasNextDouble()){
                System.out.println("Введите первое сопротивление в Double!");
                in.next();
            }
            R1 = in.nextDouble();

            System.out.print("Введите второе сопротивление: ");
            while(!in.hasNextDouble()){
                System.out.println("Введите второе сопротивление в Double!");
                in.next();
            }
            R2 = in.nextDouble();

            System.out.print("Введите третье сопротивление: ");
            while(!in.hasNextDouble()){
                System.out.println("Введите третье сопротивление в Double!");
                in.next();
            }
            R3 = in.nextDouble();


        R = 1 / (1 / R1 + 1 / R2 + 1 / R3);

        System.out.println("Общее сопротивление параллельного соединения: " + R);
    }

}
