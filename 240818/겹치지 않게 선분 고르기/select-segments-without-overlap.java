import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static int MAX_N = 15;

    static Line[] lines = new Line[MAX_N];
    static ArrayList<Line> lineList = new ArrayList<>();

    static int n;
    static int ans = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 선분의 개수 입력 받기
        n = sc.nextInt();
        
        // 선분의 시작 좌표, 끝 좌표 입력 받기
        for (int i=0; i<n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            lines[i] = new Line(x1, x2);
        }

        // 겹치는 선분의 최대 값 구하기
        getMaxDuplication(0);

        // 겹치는 선분의 최대 값 출력
        System.out.println(ans);
    }

    static void getMaxDuplication(int cnt) {
        
        // 다 돌았다면
        if (cnt == n) {
            // 겹치지 않고 뽑을 수 있는 선분 개수 계산
            int max = 0;
            for (int i=0; i<n; i++) {
                for (int j=i+1; j<n; j++) {
                    // 겹치지 않는다면
                    if (!isOverlapped(lineList.get(i), lineList.get(j))) {
                        // 겹치지 않는 선분 개수 추가
                        max++;
                    }
                }
            }

            // 현재 기준 겹치는 선분의 최대 개수 ans 에 저장
            ans = Math.max(ans, max);

            // 퇴각
            return;
        }
        
        // n
        for (int i=0; i<n; i++) {
            lineList.add(lines[i]);
            getMaxDuplication(cnt+1);
            lineList.remove(lineList.size()-1);
        }

    }

    static boolean isOverlapped(Line line1, Line line2) {
        // 겹치지 않는 경우
        if (line1.x2 < line2.x1 || line2.x2 < line1.x1)
            return false;
        
        // 나머지는 겹치는 경우
        return true;
    }

}

class Line {
    int x1;
    int x2;

    public Line(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}