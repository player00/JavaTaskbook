package Variant_9.Paragraph_7;

public class H_341 {

    public static void main(String args[]) {
        int n = 5;
        long[] a = new long[n];
        long min = 9999, max = -9999;

        for (int i = 0; i < n; i++) {
            a[i] = Math.round(Math.random() * 200 - 100);
            System.out.printf("a[%2d] = %d\n", i + 1, a[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                min = Math.min(min, Math.abs(a[i] - a[j]));
                max = Math.max(max, Math.abs(a[i] - a[j]));
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

}
