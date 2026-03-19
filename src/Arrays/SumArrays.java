package Arrays;

public class SumArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumArray(arr));
    }
    static int sumArray(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
