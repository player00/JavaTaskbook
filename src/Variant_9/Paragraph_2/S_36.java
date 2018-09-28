package Variant_9.Paragraph_2;

import Helpers.STools;

public class S_36 {

    public static void main(String args[]){

        double a, b, c;

        a = STools.readDouble("a:");
        b = STools.readDouble("b:");
        c = STools.readDouble("c:");

        if ((a < b) && (b < c))
            System.out.println("Выполняется");
        else
            System.out.println("Не выполняется");
    }
}
