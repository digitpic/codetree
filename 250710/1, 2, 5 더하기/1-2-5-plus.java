import java.util.*;

public class Main {
    private static final int MAX = 1_000;
    
    private static int n;
    private static int[] numbers = new int[]{1, 2, 5};
    private static int[] dp = new int[MAX + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= numbers[j]) {
                    dp[i] = (dp[i] + dp[i - numbers[j]]) % 10_007;
                }
            }
        }

        System.out.println(dp[n]);
    }
}