package AdvanceSorting;

import java.util.Arrays;

public class MergeSortCode {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSort(int[] arr){
        int n = arr.length;
        if (n == 1) {
            return;
        }
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n-n/2];
        for (int i = 0; i < n / 2; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < n - n/2; i++) {
            arr2[i] = arr[i+n/2];
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr1,arr2,arr);


    }
    static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0,k = 0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j])c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i<a.length)c[k++] = a[i++];
        while (j<b.length)c[k++] = b[j++];
    }
}
