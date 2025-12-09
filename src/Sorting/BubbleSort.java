package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void stableBubbleSort(int[] arr){
        int n = arr.length;
        // n-1 iterations/passes
        for(int i = 0; i < n-1; i++){
            boolean flag = false; // has any swapping happened
            for(int j = 0; j < n-i-1; j++){
                /*
                last i elements are already at correct sorted positions,
                so no need to check them
                 */
                if(arr[j] > arr[j+1]){
                    // swap - a[j], a[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; // some swap has happened
                }
            }
            if(!flag){ // have any swaps happened?
                return;
            }
        }
    }
}
