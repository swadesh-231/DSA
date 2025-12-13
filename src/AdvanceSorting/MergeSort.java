package AdvanceSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5,6,4,3,8,9,7,6,5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSort(int[] arr){
        if(arr.length<=1){
            return;
        }
        int n = arr.length;
        //create two arrays n/2 each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n - n/2; i++) {
            b[i] = arr[i + n/2];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);

    }
    static void merge(int[] a, int[] b, int[]c){
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
    }

}
