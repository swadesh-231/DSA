package Recursion;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(4,3));
        System.out.println(powLog(4,3));
    }
    static int pow(int a, int b){
        if (b ==0) return 1;
        return a*pow(a,b-1);
    }
    static int powLog(int a ,int b){
        if (b<=0) return 1;
        int ans = powLog(a,b/2);
        if (b%2 == 0){
            return ans*ans;
        }else return a*ans*ans;
    }
}
