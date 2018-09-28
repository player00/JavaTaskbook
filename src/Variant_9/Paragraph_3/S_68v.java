package Variant_9.Paragraph_3;

import Helpers.STools;

public class S_68v {

    public static void main(String[] args) {

        int n;
        char[] numArray;
        boolean flag = false;

        n = STools.readNaturalNumber("Введите натуральное число меньше 10000: ", 9999);

        numArray = Integer.toString(n).toCharArray();

        for(int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray.length; j++) {
                if (j == i) continue;
                if (numArray[j] == numArray[i]) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("Есть повторяющиеся цифры!");
        else
            System.out.println("Нет повторяющихся цифр!");
    }
}
