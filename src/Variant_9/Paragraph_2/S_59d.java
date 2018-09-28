package Variant_9.Paragraph_2;

import Helpers.STools;

public class S_59d {

    public static void main(String[] args) {

        double x, y;

        x = STools.readDouble("x:");
        y = STools.readDouble("y:");

        if (((x >= -0.5) && (x <= 0.5)) && ((y >= -1) && (y <= 1)))
            System.out.println("Принадлежит!");
        else
            System.out.println("Не принадлежит!");
    }
}
