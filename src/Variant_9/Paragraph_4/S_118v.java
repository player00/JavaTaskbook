package Variant_9.Paragraph_4;

public class S_118v {

    public static void main(String[] args) {

        double res = 1 / 10000;

        for (double i = 9999; i > 0; i -= 2){
            res -= 1 / i;
        }

        for (double i = 9998; i > 0; i -= 2){
            res += 1 / i;
        }

        System.out.println("Результат: " + res);

    }
}
