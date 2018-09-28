package Variant_9.Paragraph_2;

import Helpers.STools;

public class S_55 {

    public static void main(String args[]){
        double a, b, c, d;

        a = STools.readDouble("a:");
        b = STools.readDouble("b:");
        c = STools.readDouble("c:");
        d = STools.readDouble("d:");

        if (((c > a) && (d > b)) || ((c > b) && (d > a)))
            System.out.println("Можно!");
        else
            System.out.println("Нельзя!");
    }
}
