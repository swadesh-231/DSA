package Arrays;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,5,5,5};
        int target = 5;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
