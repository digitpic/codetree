import java.util.Scanner;
public class Main {

    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = new int[]{0, 1, -1, 0};
        int[] dy = new int[]{1, 0, 0, -1};

        n = sc.nextInt();
    
        // t 초 이후 구슬 위치 구하기
        int t = sc.nextInt();

        // 초기 위치
        // r 행 c 열
        int r = sc.nextInt();
        int c = sc.nextInt();

        // U, D, R, L 중 하나
        // 초기 이동 방향
        char d = sc.next().charAt(0);
        int dirNum = getDir(d);
        
        // t 만큼 반복
        while (t-- > 0) {
            int nx = r+dx[dirNum];
            int ny = c+dy[dirNum];
            if (!inRange(nx, ny)) {
                // 방향 전환
                dirNum = 3 - dirNum;
            }
            else {
                r = nx;
                c = ny;
            }
            
        }
        

        // 출력
        System.out.println(r + " " + c);
    }

    public static int getDir(char dir) {
        if (dir == 'L')
            return 3;
        else if (dir == 'R')
            return 0;
        else if (dir == 'U')
            return 2;
        else if (dir == 'D')
            return 1;
        return -1; 
    }

    public static boolean inRange(int x, int y) {
        return (1<=x && x<=n && 1<=y && y<=n);
    }
}