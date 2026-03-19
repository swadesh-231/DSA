package Patterns;

public class Patterns {
    public static void main(String[] args) {
        rectangle(6);
    }
    static void rectangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
