package Array;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a =  {1, 2, 3, 4, 5,78};
        int[] b = {6, 7, 8, 9, 10,43};
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        System.out.println(Arrays.toString(c));
    }
}
