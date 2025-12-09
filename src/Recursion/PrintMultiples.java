package Recursion;

public class PrintMultiples {
    public static void main(String[] args) {
        printMulti(5,4);
    }
    static void printMulti(int n, int k){
        //base case
        if (k ==1) {
            System.out.println(n);
            return;
        }
        printMulti(n,k-1);
        System.out.println(n*k);
    }
}
