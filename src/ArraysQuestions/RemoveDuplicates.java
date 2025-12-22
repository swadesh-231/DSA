package ArraysQuestions;


import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int k = 1;
        int[] arr = {1,1,1,2,2,3,3,4,4};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(k);
    }
}
