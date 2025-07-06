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
        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                int value = Integer.parseInt(tokens.nextToken());
                grid[i][j] = value;
            }
        }

        dp[0][n - 1] = grid[0][n - 1];
        for (int i = n - 2; i >= 0; i--) {
            dp[0][i] = dp[0][i + 1] + grid[0][i];
        }

        for (int i = 1; i < n; i++) {
            dp[i][n - 1] = dp[i - 1][n - 1] + grid[i][n - 1];
        }

        for (int i = 1; i < n; i++) {
            for (int j = n - 2; j >= 0; j--) {
                int top = dp[i - 1][j] + grid[i][j];
                int right = dp[i][j + 1] + grid[i][j];
                dp[i][j] = Math.min(top, right);
            }
        }

        System.out.println(dp[n - 1][0]);
    }
}