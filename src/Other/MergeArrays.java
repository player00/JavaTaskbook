package Other;

import java.util.Arrays;

public class MergeArrays {

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int l = a1.length + a2.length;
        int[] a12 = new int[l];

        int k = 0;
        for (int i : a1) {
            a12[k] = i;
            k++;
        }
        for (int i : a2) {
            a12[k] = i;
            k++;
        }

        Arrays.sort(a12);

        return a12;
    }

    public static void main(String args[]) {
        int[] a1 = {2, 4, 3}, a2 = {-4, 6, 1, 0};

        System.out.print(Arrays.toString(mergeArrays(a1, a2)));
    }

}
