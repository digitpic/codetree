import java.util.*;
import java.io.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int MAX = 10_000;

    private static int n;
    private static int m;

    private static int[] coin = new int[MAX + 1];
    private static int[] dp = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            coin[i] = Integer.parseInt(tokens.nextToken());
        }
        
        for (int i = 1; i <= MAX; i++) {
            dp[i] = INT_MAX;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= coin[j]) {
                    if (dp[i - coin[j]] == INT_MAX) {
                        continue;
                    }
                    
                    dp[i] = Math.min(dp[i], dp[i - coin[j]] + 1);
                }
            }
        }        

        if (dp[m] == INT_MAX) {
            dp[m] = -1;
        }
        
        System.out.println(dp[m]);
    }
}