package Variant_9.Paragraph_6;

import Helpers.STools;

public class S_194 {

    public static void main(String[] args) {
        int n, a, sum = -10;
        int[] x;

        n = STools.readNaturalNumber("Введите натуральное n: ");
        x = new int[n];

        a = STools.readInt("Введите целое a: ");

        for (int i = 0; i < n; i++) {
            x[i] = STools.readInt("Введите x[" + i + "]");
        }

        for (int i=0;i<n-1;i++){
            if(x[i] == a){
                sum = 0;
                for(int j = i+1; j<n;j++){
                    sum += x[j];
                }
                break;
            }
        }

        System.out.println("Сумма равна " + sum);
    }
}
