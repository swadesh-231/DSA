package TwoDArrays;

public class WaveArrayPrinting {
    public static void main(String[] args) {

    }
    static void rowWave(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // left to right
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // right to left
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

}

