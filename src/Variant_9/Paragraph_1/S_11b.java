package Variant_9.Paragraph_1;

import Helpers.STools;

public class S_11b {

    public static void main(String args[]){

        double x, y, z, a, b;

        x = STools.readDouble("x: ");
        y = STools.readDouble("y: ");
        z = STools.readDouble("z: ");


        a = (3 + Math.exp(y - 1)) / (1 + Math.pow(x, 2) * Math.abs(y - Math.tan(z)));
        b = 1 + Math.abs(y - x)+ (Math.pow(y - x, 2) / 2) + (Math.pow(Math.abs(y - x), 3) / 3);

        System.out.println("a = " + a + "; b = " + b + ";");

    }
}
