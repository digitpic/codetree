import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                board[i][j] = sc.nextInt();
        
        int cnt = 0;

        for (int i=0; i<n; i++)
            for (int j=0; j<n-2; j++)
                cnt = Math.max(cnt, board[i][j] + board[i][j+1] + board[i][j+2]);

        System.out.println(cnt);

    }
}