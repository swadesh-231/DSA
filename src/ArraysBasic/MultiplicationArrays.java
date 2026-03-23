package ArraysBasic;

public class MultiplicationArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(multiplication(arr));
    }
    static int multiplication(int[] arr) {
        int mult = 1;
        for (int i = 1; i < arr.length; i++) {
            mult *= arr[i];
        }
        return mult;
    }
}
