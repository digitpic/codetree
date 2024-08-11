import java.util.Scanner;

public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] board = new int[n];
        
        // 배열 입력
        for(int i = 0; i < n; i++)
            board[i] = sc.nextInt();

        // 계산
        int ans = INT_MAX;

        // 완전 탐색
        for(int i = 0; i < n; i++) {

            int sumDist = 0;

            for(int j = 0; j < n; j++)
                sumDist += Math.abs(j - i) * board[j];

            ans = Math.min(ans, sumDist);
        }
        
        // 출력
        System.out.println(ans);

    }
}