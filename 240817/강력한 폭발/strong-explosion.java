import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static final int BOMB_TYPE_NUM = 3;
    static final int MAX_N = 20;
    
    static int n;

    static int[][] bombType = new int[MAX_N][MAX_N];
    static boolean[][] bombed = new boolean[MAX_N][MAX_N];
    
    static int ans;

    static ArrayList<Pair> bombPos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // n
        for(int i = 0; i < n; i++) {

            // n
            for(int j = 0; j < n; j++) {

                int bombPlace = sc.nextInt();

                // 폭탄 좌표 설정
                if(bombPlace == 1) {
                    bombPos.add(new Pair(i, j));
                }

            }
        }
        
        findMaxArea(0);
        
        System.out.print(ans);

    }

    public static void findMaxArea(int cnt) {

        // 폭탄 개수만큼 재귀
        if (cnt == (int) bombPos.size()) {

            // 정답 계산 후
            ans = Math.max(ans, calc());

            // 퇴각
            return;

        }

        // 폭탄 타입은 1, 2, 3 으로 3가지가 존재
        for(int i = 1; i <= 3; i++) {
            
            // 폭탄 좌표 가져오기
            int x = bombPos.get(cnt).x;
            int y = bombPos.get(cnt).y;

            // 폭탄 좌표에 들어갈 수 있는 폭탄 타입 순서대로 대입해보고
            bombType[x][y] = i;

            // 백트래킹
            findMaxArea(cnt + 1);

            // 다음 폭탄 타입 입력을 위해 현재 폭탄 좌표의 폭탄 타입 초기화
            bombType[x][y] = 0;

        }

    }

    public static int calc() {

        // Step1.
        // 폭탄이 터진 위치를 표시하는 배열을 초기화
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                bombed[i][j] = false;
        
        // Step2.
        // 각 폭탄의 타입에 따라 초토화 되는 영역을 표시
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(bombType[i][j] > 0)
                    bomb(i, j, bombType[i][j]);
        
        // Step3.
        // 초토화된 영역의 수 계산
        int cnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(bombed[i][j])
                    cnt++;
        
        return cnt;

    }

    public static void bomb(int x, int y, int bType) {

        // 폭탄 타입에 따라 초토화 되는 지역을 미리 정의
        Pair[][] bombShapes = {
            // index 0 사용 안 함
            {},

            // Type 1.
            {new Pair(-2, 0), new Pair(-1, 0), new Pair(0, 0), new Pair(1, 0), new Pair(2, 0)},
            // Type 2.
            {new Pair(-1, 0), new Pair(1, 0), new Pair(0, 0), new Pair(0, -1), new Pair(0, 1)},
            // Type 3.
            {new Pair(-1, -1), new Pair(-1, 1), new Pair(0, 0), new Pair(1, -1), new Pair(1, 1)}

        };
        
        // 폭탄 타입은 3가지로 다르지만 폭파되는 범위의 개수는 5칸으로 동일
        for(int i = 0; i < 5; i++) {

            int dx = bombShapes[bType][i].x;
            int dy = bombShapes[bType][i].y;
            
            int nx = x + dx, ny = y + dy;
            
            // 격자 내에 존재하는 칸에 대해서만 초토화 진행
            if(inRange(nx, ny))
                bombed[nx][ny] = true;

        }

    }

    public static boolean inRange(int x, int y) {

        return 0 <= x && x < n && 0 <= y && y < n;

    }

}

class Pair { 

    int x, y;

    public Pair(int x, int y) { 

        this.x = x; 
        this.y = y; 

    } 

}