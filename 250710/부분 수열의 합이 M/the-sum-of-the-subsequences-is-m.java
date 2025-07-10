import java.util.*;
import java.io.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int MAX = 10_000;

    private static int n;
    private static int m;

    private static int[] numbers = new int[MAX + 1];
    private static int[] dp = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            numbers[i] = Integer.parseInt(tokens.nextToken());
        }
        
        for (int i = 1; i <= MAX; i++) {
            dp[i] = INT_MAX;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = m; j >= 0; j--) {
                if (j >= numbers[i]) {
                    if (dp[j - numbers[i]] == INT_MAX) {
                        continue;
                    }
                    
                    dp[j] = Math.min(dp[j], dp[j - numbers[i]] + 1);
                }
            }
        }        

        if (dp[m] == INT_MAX) {
            dp[m] = -1;
        }
        
        System.out.println(dp[m]);
    }
}