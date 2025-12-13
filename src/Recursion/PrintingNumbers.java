package Recursion;

public class PrintingNumbers {
    public static void main(String[] args) {
        printOneToN(5);
        System.out.println();
        printNToOne(5);
    }
    static void printOneToN(int num){
        if (num ==0) return;
        printOneToN(num-1);
        System.out.print(num+" ");
    }
    static void printNToOne(int num){
        if (num ==0) return;
        System.out.print(num+" ");
        printNToOne(num-1);
    }
}
