package Variant_9.Paragraph_7;

import java.util.Arrays;

import static Helpers.HTools.randomBetween;

import static java.lang.Math.*;

public class H_341 {

    private final static int N = 5;

    private static long[] run(long[] a) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                min = min(min, abs(a[i] - a[j]));
                max = max(max, abs(a[i] - a[j]));
            }
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (min == abs(a[i] - a[j])) {
                    x1 = a[i];
                    y1 = a[j];
                    break;
                }
            }
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (max == abs(a[i] - a[j])) {
                    x2 = a[i];
                    y2 = a[j];
                    break;
                }
            }
        }

        return new long[]{x1, y1, x2, y2};
    }

    public static void main(String[] args) {
        long[] a = new long[N];

        a[0] = randomBetween(-100, 100);
        for (int i = 1; i < N; i++) {
            boolean check;
            long newA;
            do {
                check = true;
                newA = randomBetween(-100, 100);
                for (int j = 0; j < i; j++) {
                    if (newA == a[j]) {
                        check = false;
                    }
                }
            } while (!check);

            a[i] = newA;
        }

        System.out.println(Arrays.toString(a));

        long[] res = run(a);

        System.out.printf("x1 = %d y1 = %d\nx2 = %d y2 = %d",res[0],res[1],res[2],res[3]);
    }

}
