package Variant_9.Paragraph_7;

import java.util.Arrays;
import java.util.Random;

public class S_341 {

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0};
        int temp, max1 = 0, max2 = 0, min1 = 0, min2 = 0, min = Integer.MAX_VALUE, max = 0;
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            do {
                temp = random.nextInt(100);
            } while (Arrays.asList(a).indexOf(temp) != -1);
            a[i] = temp;
            System.out.println(a[i]);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (Math.abs(a[i] - a[j]) > max) {
                    max = Math.abs(a[i] - a[j]);
                    max1 = i;
                    max2 = j;
                }
                if (Math.abs(a[i] - a[j]) < min) {
                    min = Math.abs(a[i] - a[j]);
                    min1 = i;
                    min2 = j;
                }
            }
        }
        System.out.println("Два числа, модуль разности которых максимальный, это " + a[max1] + " и " + a[max2] + ", а модуль разности равен " + max);
        System.out.println("Два числа, модуль разности которых минимальный, это " + a[min1] + " и " + a[min2] + ", а модуль разности равен " + min);

    }
}
