package ArraysBasic;

import java.util.Scanner;

public class SearchElementInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,33,44,55,6};
        int key = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                System.out.println("Found at index " + i);
            }
        }
    }
}
