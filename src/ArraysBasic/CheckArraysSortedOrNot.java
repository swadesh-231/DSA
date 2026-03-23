package ArraysBasic;

public class CheckArraysSortedOrNot {
    public static void main(String[] args) {

    }
    static boolean check(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
