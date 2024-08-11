import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] board = new int[n];

        for (int i=0; i<n; i++)
            board[i] = sc.nextInt();
        
        int totalSum = 0;
        for (int i = 0; i < n; i++)
            totalSum += board[i];
        
        int sum = 0, diff = 0, ans = Integer.MAX_VALUE;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                sum = totalSum - (board[i] + board[j]);
                diff = Math.abs(sum - s);
                ans = Math.min(ans, diff);
            }
        }

        System.out.println(ans);

    }
}