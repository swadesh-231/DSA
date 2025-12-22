package TwoDArrays;

public class TwoDArraysDemo {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        printTwoDArray(arr);
        System.out.println(findMax(arr));

    }
    static void printTwoDArray(int[][] arr) {
        for (int[] ints : arr) { // row
            for (int anInt : ints) { //column
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
