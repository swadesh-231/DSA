package Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] ar = {4, 6, 3, 5, 8, 2};
        int target = 7;
        printPairsWithTarget(ar,target);

    }
    static void printPairsWithTarget(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pair found");
        }
    }
}
