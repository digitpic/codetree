import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX = 1_000;

    private static int n;
    private static int[] dp = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());

        /* bottom-up tabulation */
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        find();

        System.out.println(dp[n] % 10_007);
    }

    private static void find() {
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
    }
}