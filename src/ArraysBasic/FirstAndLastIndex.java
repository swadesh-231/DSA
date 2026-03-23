package ArraysBasic;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {1,1,4,4,4,5,5,6,7,8};
        System.out.println(Arrays.toString(findIndexes(arr, 4)));
    }
    static int findFirstIndex(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    static int[] findIndexes(int[] arr, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }
}
