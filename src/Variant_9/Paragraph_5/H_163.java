package Variant_9.Paragraph_5;

public class H_163 {

    public static void main(String args[]) {
        double[] a = new double[37], b = new double[37];
        boolean need = false;

        for (int i = 0; i < 37; i++) {
            a[i] = Math.random() * 20 - 10;
            b[i] = a[i];
        }

        for (int i = 0; i < 37; i++) {
            if (a[i] >= 0) {
                need = true;
            }
            if (need) {
                b[i] -= 0.5;
            }
            System.out.printf("a[%2d] = %5.2f b[%2d] = %.2f\n", i + 1, a[i], i + 1, b[i]);
        }
    }

}
