import java.util.*;
import java.io.*;

/* top-down memoization */
public class Main {
    private static final int MAX = 45;
    private static final int UNUSED = -1;

    private static int n;
    private static int[] memo = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());

        for (int i = 0; i <= MAX; i++) {
            memo[i] = UNUSED;
        }

        System.out.println(find(n));
    }

    private static int find(int number) {
        if (memo[number] != UNUSED) {
            return memo[number];
        }
        
        if (number == 1 || number == 2) {
            return memo[number] = 1;
        }

        return memo[number] = find(number - 1) + find(number - 2);
    }
}

/* bottom-up tabulation
public class Main {
    private static final int MAX = 45;

    private static int n;
    private static int[] dp = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());

        find();

        System.out.println(dp[n]);
    }

    private static void find() {
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }
}
*/