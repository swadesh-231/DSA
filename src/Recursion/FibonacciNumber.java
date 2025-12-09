package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
    static int fib(int num){
        if (num <=1) return num;
        return fib(num -1)+fib(num-2);
    }
}
