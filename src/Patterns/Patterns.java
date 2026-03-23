package Patterns;

public class Patterns {
    public static void main(String[] args) {
        rectangle(6);
        startPatterns(5);
        digit(5);
        digit2(5);
        Bigcharacter(5);
        Bigcharacter2(5);
        smallCharacter(5);
        smallCharacter2(5);
    }
    static void rectangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
    static void startPatterns(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void digit(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void digit2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void Bigcharacter(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }
    }
    static void Bigcharacter2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char) (i+64)+" ");
            }
            System.out.println();
        }
    }
    static void smallCharacter(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char) (j+96)+" ");
            }
            System.out.println();
        }
    }
    static void smallCharacter2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char) (i+96)+" ");
            }
            System.out.println();
        }
    }
}
