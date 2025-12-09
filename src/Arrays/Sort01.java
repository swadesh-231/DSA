package Arrays;

import java.util.Arrays;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,0,0,1};
        sort01(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort01(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
