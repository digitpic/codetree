import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i=1; i<=m; i++) {
            
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            board[x][y] = i;
            
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}