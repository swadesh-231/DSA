package TwoDArrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,4},
                {2,6,7},
                {9,8,3}
        };
        printTwoDArray(arr);
        System.out.println(findMax(arr));
    }
    static void printTwoDArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int findMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]>max) max = arr[i][j];
            }
        }
        return max;
    }

}
