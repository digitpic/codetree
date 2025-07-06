import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 100;

    private static int n;
    private static int[][] grid = new int[MAX_N][MAX_N];
    private static int[][] dp = new int[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());

        for (int r = 0; r < n; r++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int c = 0; c < n; c++) {
                grid[r][c] = Integer.parseInt(tokens.nextToken());
            }
        }

        dp[0][0] = grid[0][0];
        for (int c = 1; c < n; c++) {
            dp[0][c] = Math.max(dp[0][c - 1], grid[0][c]);
        }

        for (int r = 1; r < n; r++) {
            dp[r][0] = Math.max(dp[r - 1][0], grid[r][0]);
        }

        for (int r = 1; r < n; r++) {
            for (int c = 1; c < n; c++) {
                int left = dp[r][c - 1];
                int up = dp[r - 1][c];
                int min = Math.min(left, up);
                dp[r][c] = Math.max(min, grid[r][c]);
            }
        }
        
        System.out.println(dp[n - 1][n - 1]);
    }
}