package Arrays;

public class ArrayFindSmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(findLargest(arr));
        System.out.println(findSmallest(arr));
    }
    static int findLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) max = j;
        }
        return max;
    }
    static int findSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) min = j;
        }
        return min;
    }
}
