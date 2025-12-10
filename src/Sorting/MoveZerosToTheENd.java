package Sorting;

import java.util.Arrays;

public class MoveZerosToTheENd {
    public static void main(String[] args) {
        int[] arr = {0,2,0,1,5,0,0,6,7,8,9};
        moveZerosToTheENd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZerosToTheENd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
