import java.util.Scanner;
public class Main {

    public static int n;
    public static int m;

    public static void main(String[] args) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        // 좌표 초기 값
        int x=0, y=0;

        // 방향 초기 값
        int dir = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // row
        m = sc.nextInt(); // col

        // row: 0 ~ n-1
        // col: 0 ~ m-1
        int[][] board = new int[n][m]; // initializing with 0

        // 초기 값 입력
        board[x][y] = 1;
        
        // n*m 만큼 반복
        for (int i=2; i<=n*m; i++) {
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (!inRange(nx, ny) || board[nx][ny]!=0) {
                // 시계 방향 90도 전환
                dir = (dir+1)%4;
            }

            // 이동
            x += dx[dir];
            y += dy[dir];
            board[x][y] = i;
            
        }


        // 출력
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean inRange(int x, int y) {
        return (0<=x && x<n && 0<=y && y<m);
    }

}