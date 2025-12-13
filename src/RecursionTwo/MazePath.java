package RecursionTwo;

import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(maze(1,1,n,m));
    }
    static int maze(int row,int col,int n,int m){
        if(row==n||col==m){
            return 1;
        }
      int rightWays = maze(row,col+1,n,m);
      int leftWays = maze(row+1,col,n,m);
      return rightWays+leftWays;
    }
}
