package Variant_9.Paragraph_7;

public class S_334g {

    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100; i++)
            for (int j = 1; j <= i; j++)
                sum += 1 / (2 * j + i);

        System.out.println("Результат: " + sum);
    }
}
