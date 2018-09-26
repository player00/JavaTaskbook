package Variant_9.Paragraph_1;

import Helpers.STools;

public class S_24 {

    public static void main(String args[]){

        double x1,x2,y1,y2,result;

        x1 = STools.readDouble("Введите x первой точки: ");
        x2 = STools.readDouble("Введите x второй точки: ");
        y1 = STools.readDouble("Введите y первой точки: ");
        y2 = STools.readDouble("Введите y второй точки: ");

        result = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

        System.out.println("Расстояние между точками: " + result);


    }
}
