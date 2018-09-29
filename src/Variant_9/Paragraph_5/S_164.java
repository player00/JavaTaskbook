package Variant_9.Paragraph_5;

public class S_164 {

    public static void main(String[] args) {

        double[] a = new double[37];
        double[] res = new double[37];

        for (int i = 0; i < 37; i++) {
            a[i] = Math.random() * 21 - 10;
        }

        for (int i = 0; i < 37; i++) {
            res[i] = a[i];
            if (res[i] > 0.0) {
                for (int j = i; j < 37; j++) {
                    res[j] = a[j] - 0.5;
                }
                break;
            }
        }

        for (int i = 0; i < 37; i++) {
            System.out.printf("Было %.2f, а стало %.2f\n", a[i], res[i]);
        }
    }
}
