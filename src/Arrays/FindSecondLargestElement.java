package Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,7,8,9};
        System.out.println(findSecondLargest(arr));
        System.out.println(findSecondSmallest(arr));

    }
    static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int sMx = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) max = j;
        }
        for (int j : arr) {
            if (j > sMx && j != max) {
                sMx = j;
            }
        }
        return sMx;
    }
    static int findSecondSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<sMin && arr[i]!=min){
                sMin = arr[i];
            }
        }
        return sMin;
    }
}
