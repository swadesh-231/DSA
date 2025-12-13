package AdvanceSorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        int[] c = new int[a.length+b.length];
        mergeTwoSortedArrays(a,b,c);
        System.out.println(Arrays.toString(c));

    }
    static void mergeTwoSortedArrays(int[] a, int[] b, int[] c){
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
