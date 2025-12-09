package Recursion;

public class AlternateSum {
    public static void main(String[] args) {
        System.out.println(alternatingSum(5));
    }
    static int alternatingSum(int n) {
        if (n % 2 == 0) return -(n/2);
        return (n + 1) / 2;
    }

}
