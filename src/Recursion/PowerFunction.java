package Recursion;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(power(2,3));
        System.out.println(pow(2,3));
    }
    static int power(int n, int p) {
        if (p == 0) return 1;
        return n * power(n, p - 1);
    }
    static int pow(int p, int q){
        if(q == 0) return 1;
        int smallPow = pow(p, q/2);
        if(q % 2 == 0){ // even
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }

}
