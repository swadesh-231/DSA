package ArraysBasic;

public class SumOfEvenAndOddIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9};
        findSumEvenOddIdx(arr);
    }
    static void findSumEvenOddIdx(int[] arr){
        int evenIdx = 0;
        int oddIdx = 0;
        for(int i=0;i<arr.length;i++){
            if (i%2==0){
                evenIdx += arr[i];
            }
            else {
                oddIdx += arr[i];
            }
        }
        System.out.println(evenIdx);
        System.out.println(oddIdx);
    }
}
