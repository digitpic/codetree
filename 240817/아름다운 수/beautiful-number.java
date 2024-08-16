import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static int n;
    static ArrayList<Integer> numList = new ArrayList<>();
    static int ans;
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        countBeautifulSeq(0);
        
        System.out.print(ans);

    }

    public static void countBeautifulSeq(int cnt) {

        if(cnt == n) {

            if(isBeautiful())
                ans++;

            return;

        }
        
        for(int i = 1; i <= 4; i++) {

            numList.add(i);
            countBeautifulSeq(cnt + 1);
            numList.remove(numList.size() - 1);

        }

    }

    public static boolean isBeautiful() {

        // 현재 수에 따른 i 증가
        // 1인 경우 +1
        // 2인 경우 +2
        // 3인 경우 +3
        // 4인 경우 +4
        for(int i = 0; i < n; i += numList.get(i)) {

            // 현재(i) 에서 +1 ~ ... ~ +4 를 더해도 n을 벗어나지 않는지 확인
            // 범위 검증
            if(n <= i + numList.get(i) - 1)
                return false;

            // 숫자 개수 검증
            for(int j = i; j < i + numList.get(i); j++)
                if(numList.get(j) != numList.get(i))
                    return false;
        }

        return true;

    }

}