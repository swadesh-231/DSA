package Array;

import java.util.Arrays;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[src.length];

        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }


//        int[] newArr = new int[]{1,2,3,4,5};
//        int[] dest = Arrays.copyOf(arr, arr.length);

//        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(dest));
    }
}
