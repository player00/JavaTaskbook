package Variant_9.Paragraph_7;

public class H_334g {

    private static double run(){
        double sum = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum += 1.0 / (2 * j + i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + run());
    }

}
