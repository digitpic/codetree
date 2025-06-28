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

        dp[0] = 1;
        dp[1] = 1;

        find();

        System.out.println(dp[n]);
    }

    private static void find() {
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 2]) % 10_007;
        }
    }
}