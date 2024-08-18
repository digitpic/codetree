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
        n = sc.nextInt();
        
        // 입력
        for (int i=0; i<n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            lines[i] = new Line(x1, x2);
        }

        getMaxDuplication(0);

        System.out.println(ans);
    }

    static void getMaxDuplication(int cnt) {
        
        // 다 돌았으면
        if (cnt == n) {
            // 겹치는지 확인
            int max = 0;
            for (int i=0; i<n; i++) {
                for (int j=i+1; j<n; j++) {
                    // 겹친다면
                    if (isDuplicated(lineList.get(i), lineList.get(j))) {
                        // 정답 증가
                        max++;
                    }
                }
            }

            // 겹치는 개수 확인
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

    static boolean isDuplicated(Line line1, Line line2) {
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