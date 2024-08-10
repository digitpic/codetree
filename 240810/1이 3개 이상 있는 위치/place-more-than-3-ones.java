import java.util.Scanner;
public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // index range: 0 ~ n-1
        int[][] board = new int[n][n];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int cnt = 0;
        int ans = 0;
        for (int i=0; i<n; i++) 
            for (int j=0; j<n; j++) 
                board[i][j] = sc.nextInt();
        
        // 배열 전체 조회
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                // 배열 각 칸마다 상하좌우 탐색
                for (int dir=0; dir<4; dir++) {
                    int nx = i + dx[dir];
                    int ny = j + dy[dir];
                    if (inRange(nx, ny) && board[nx][ny] == 1) cnt++;
                }
                if (cnt >= 3) ans++;
                cnt = 0;
            }
        }
        
        System.out.println(ans);

    }

    public static boolean inRange(int x, int y) {
        return (0<=x && x<n && 0<=y && y<n);
    }
}