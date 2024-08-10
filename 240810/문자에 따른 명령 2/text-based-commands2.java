import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query = sc.next();

        /*
         * [초기 세팅]
         * x: 0, y: 0
         * 0: 동
         * 1: 남
         * 2: 서
         * 3: 북
         */
    
        int x = 0, y = 0;
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int dir = 3;

        // 위치 이동
        for (int i=0; i<query.length(); i++) {
            if (query.charAt(i) == 'L') {
                // 좌측 회전
                dir = (dir-1+4)%4;
            }
            else if (query.charAt(i) == 'R') {
                // 우측 회전
                dir = (dir+1)%4;
            }
            else if (query.charAt(i) == 'F') {
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.println(x + " " + y);
    }
}