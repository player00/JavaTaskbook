package Variant_9.Paragraph_1;

import Helpers.STools;

public class S_09 {

    public static void main(String args[]){

        double R1, R2, R3, R;

        R1 = STools.readDouble("Введите первое сопротивление: ");
        R2 = STools.readDouble("Введите второе сопротивление: ");
        R3 = STools.readDouble("Введите третье сопротивление: ");


        R = 1 / (1 / R1 + 1 / R2 + 1 / R3);

        System.out.println("Общее сопротивление параллельного соединения: " + R);
    }

}
