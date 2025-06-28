import java.util.*;
import java.io.*;

/* top-down memoization */
public class Main {
    private static final int MAX = 1_000;

    private static int n;
    private static int[] memo = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());

        for (int i = 0; i <= MAX; i++) {
            memo[i] = -1;
        }

        System.out.println(find(n));
    }

    private static int find(int number) {
        if (memo[number] != -1) {
            return memo[number];
        }

        if (number == 0 || number == 1) {
            return memo[number] = 0;
        }

        if (number == 2 || number == 3) {
            return memo[number] = 1;
        }

        return memo[number] = (find(number - 2) + find(number - 3)) % 10_007;
    }
}

/* bottom-up tabulation
public class Main {
    private static final int MAX = 1_000;

    private static int n;
    private static int[] dp = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        find();

        System.out.println(dp[n]);
    }

    private static void find() {
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 3]) % 10_007;
        }
    }
}
*/