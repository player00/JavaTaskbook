package Variant_9.Paragraph_6;

import Helpers.STools;

public class S_229 {

    public static void main(String[] args) {
        double x, y;
        int k;

        x = STools.readDouble("Введите действительное x: ", 0);
        y = STools.readDouble("Введите действительное y: ", 1);

        for(int i = 0; i < Integer.MAX_VALUE; i++){
            if ((x >= Math.pow(y, i-1)) && (x < Math.pow(y, i))){
                System.out.println("k = " + i);
                break;
            }
            k = -i;
            if ((x >= Math.pow(y, k-1)) && (x < Math.pow(y, k))){
                System.out.println("k = " + k);
                break;
            }
        }
    }
}
