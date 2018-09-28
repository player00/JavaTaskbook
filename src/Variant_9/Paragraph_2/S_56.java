package Variant_9.Paragraph_2;

import Helpers.STools;

public class S_56 {

    private static boolean ifRectangleFitsHole(double a, double b, double c, double d){

        return ((c > a) && (d > b)) || ((c > b) && (d > a));
    }

    public static void main(String[] args) {

        double a, b, c, x, y;

        a = STools.readDouble("a:");
        b = STools.readDouble("b:");
        c = STools.readDouble("c:");
        x = STools.readDouble("x:");
        y = STools.readDouble("y:");

        if (ifRectangleFitsHole(a,b,x,y) || ifRectangleFitsHole(a,c,x,y) || ifRectangleFitsHole(b,c,x,y))
            System.out.println("Пройдёт!");
        else
            System.out.println("Не пройдёт!");
    }
}
