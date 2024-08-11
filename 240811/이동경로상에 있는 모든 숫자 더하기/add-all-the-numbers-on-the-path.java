import java.util.Scanner;
public class Main {

    public static int n;

    public static void main(String[] args) {
        
        // 동북서남
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        Scanner sc = new Scanner(System.in);

        // n*n 격자
        n = sc.nextInt();

        // t 개의 명령
        int t = sc.nextInt();

        // 이동 명령
        String query = sc.next();
        
        // 0으로 초기화 된 격자 생성
        int[][] board = new int[n][n];

        // 초기 값 세팅
        int x = n/2;
        int y = n/2;
        int dir = 3;

        // 격자 정보 채우기
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                board[i][j] = sc.nextInt();

        // 시작 위치 포함
        int sum = board[x][y];

        // query 를 따라 이동하며 모든 수 더하기
        for (int i=0; i<t; i++) {

            char order = query.charAt(i);

            if (order == 'L') {
                // 좌측 90도 전환
                dir = (dir - 1 + 4) % 4;
            }
            else if (order == 'R') {
                // 우측 90도 전환
                dir = (dir + 1) % 4;
            }
            else {
                // 전진
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                
                // 범위 벗어나는 명령의 경우
                if (!inRange(nx, ny)) {
                    // 무시
                    continue;
                } 
                
                // 좌표 업데이트
                x = nx;
                y = ny;

                // 새로운 좌표에 해당하는 값 더하기
                sum += board[x][y];
            }

        }

        // 합 출력
        System.out.println(sum);
        
    }

    public static boolean inRange(int x, int y) {
        return (0<=x && x<n && 0<=y && y<n);
    }
    
}