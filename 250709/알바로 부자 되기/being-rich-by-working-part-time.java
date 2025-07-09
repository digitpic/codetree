import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 1_000;

    private static int n;
    private static int[] start = new int[MAX_N];
    private static int[] end = new int[MAX_N];
    private static int[] payment = new int[MAX_N];
    private static int[] dp = new int[MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(reader.readLine());
            start[i] = Integer.parseInt(tokens.nextToken());
            end[i] = Integer.parseInt(tokens.nextToken());
            payment[i] = Integer.parseInt(tokens.nextToken());
        }

        dp[0] = payment[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (isOverlap(i, j)) {
                    dp[i] = Math.max(dp[i], payment[i]);
                    continue;
                } 
                dp[i] = Math.max(dp[i], dp[j] + payment[i]);  
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    private static boolean isOverlap(int i, int j) {
        return start[i] <= start[j] && start[j] <= end[i]
                || start[i] <= end[j] && end[j] <= end[i]
                || start[j] <= start[i] && start[i] <= end[j]
                || start[j] <= end[i] && end[i] <= end[j];
    }
}