package Recursion;

public class RecursionBasic {
    public static void main(String[] args) {
        printOneToN(7);
        System.out.println();
        printNToOne(7);
    }
    static void printNToOne(int n){
        if (n == 0) return;
        System.out.print(n+" ");
        printNToOne(n-1);
    }
    static void printOneToN(int num){
        if (num == 0) return;
        printOneToN(num-1);
        System.out.print(num+" ");
    }
}
