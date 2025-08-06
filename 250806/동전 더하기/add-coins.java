import java.util.Scanner;

public class Main {    
    private static final int MAX_N = 10;
    
    private static int n;
    private static int k;
    private static int[] coins = new int[MAX_N];
    private static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
            
        for (int i = n - 1; i >= 0; i--) {
            answer += k / coins[i];
            k %= coins[i];
        }

        System.out.print(answer);
    }
    
}
