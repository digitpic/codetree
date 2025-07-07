import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 1_000;

    private static int n;
    private static int[] numbers = new int[MAX_N + 1];
    private static int[] dp = new int[MAX_N + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            numbers[i] = Integer.parseInt(tokens.nextToken());
        }

        numbers[0] = Integer.MAX_VALUE;
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}