package Variant_9.Paragraph_5;

public class S_145v {

    public static void main(String[] args) {

        long[] x = new long[20];

        x[0] = x[1] = x[2] = 1;

        for (int i = 4; i <= 20; i++) {
            x[i - 1] = (i + 3) * (x[i - 3] - 1) + (i + 4) * x[i - 4];
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(x[i]);
        }
    }
}
