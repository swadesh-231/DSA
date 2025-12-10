package Array;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(linearSearch(arr,9)));
    }
    static int[] linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return new int[]{i};
            }
        }
        return new int[]{-1};
    }
}
