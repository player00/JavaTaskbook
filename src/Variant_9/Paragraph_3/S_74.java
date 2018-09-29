package Variant_9.Paragraph_3;

import Helpers.STools;

public class S_74 {

    public static void main(String[] args) {

        int n;

        n = STools.readNaturalNumber("Введите возраст человека от 1 до 100: ", 100);

        if ((n > 10) && (n < 15))
            System.out.println("Человеку " + n + " лет");
        else if (n % 10 == 1)
            System.out.println("Человеку " + n + " год");
        else if ((n % 10 >= 2) && (n % 10 <= 4))
            System.out.println("Человеку " + n + " года");
        else
            System.out.println("Человеку " + n + " лет");

    }
}
