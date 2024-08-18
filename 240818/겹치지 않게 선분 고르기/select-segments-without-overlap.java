import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static final int MAX_N = 15;

    static int n;
    static Line[] lines = new Line[MAX_N];

    static int ans;
    static ArrayList<Line> lineList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 선분의 개수 입력 받기
        n = sc.nextInt();

        for(int i = 0; i < n; i++)
            lines[i] = new Line(0, 0);
        
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
            // 겹치는 선분이 없는 경우에만 진행
            if (anyDup()) {
                // 겹치지 않는 선분의 길이 계산
                ans = Math.max(ans, lineList.size());
                // 퇴각
                return;
            }
        }
        
        lineList.add(lines[cnt]);
        getMaxDuplication(cnt+1);
        lineList.remove(lineList.size()-1);
        getMaxDuplication(cnt+1);
    }

    static boolean anyDup() {
        for (int i=0; i<lineList.size(); i++) {
            for (int j=i+1; j<lineList.size(); j++) {
                // 하나라도 겹친다면
                if (isOverlapped(lineList.get(i), lineList.get(j))) {
                    return false;
                }
            }
        }
            
        return true;
    }

    static boolean isOverlapped(Line line1, Line line2) {
        if (line1.x2 < line2.x1 || line2.x2 < line1.x1)
            return false;
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