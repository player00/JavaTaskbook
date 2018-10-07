package Variant_9.Paragraph_4;

public class H_118v {

    private static double run() {
        double sum = 0;

        for (int sign = 1, i = 10000; i >= 1; i--) {
            sum += sign * 1.0 / i;
            sign = -sign;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + run());
    }

}
