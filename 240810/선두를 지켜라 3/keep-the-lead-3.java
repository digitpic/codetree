import java.util.Scanner;
public class Main {
    public static int MAX = 1000 * 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] posA = new int[MAX+1];
        int[] posB = new int[MAX+1];

        // A
        int indexA = 1;
        for (int i=0; i<n; i++) {

            int v = sc.nextInt();
            int t = sc.nextInt();
            
            // t 만큼 반복
            while (t-- > 0) {
                // 현재 시간대에 이전 시간대 + v 한 값 더하기
                posA[indexA] = posA[indexA - 1] + v;
                indexA++;
            }
            
        }

        // B
        int indexB = 1;
        for (int i=0; i<m; i++) {

            int v = sc.nextInt();
            int t = sc.nextInt();

            // t 만큼 반복
            while (t-- > 0) {
                // 현재 시간대에 이전 시간대 + v 한 값 더하기
                posB[indexB] = posB[indexB - 1] + v;
                indexB++;
            }   

        }

        // 선두가 몇 번 바뀌었는지 확인
        int cnt = 0, lastLeader = 0, currLeader = 0;
        for (int i=1; i<indexA; i++) {
            
            // 현재 A 가 빠른 경우
            if (posA[i] > posB[i]) {
                // 리더를 A 로 변경
                currLeader = 1;
            }

            // 현재 B 가 빠른 경우
            else if(posA[i] < posB[i]) {
                // 리더를 B 로 변경
                currLeader = 2;
            }
            // A와 B가 동일한 경우
            else if (posA[i] == posB[i]) {
                // 둘 다 리더로 변경
                currLeader = 3;
            }

            if (lastLeader != currLeader) {
                cnt++;
                lastLeader = currLeader;
            }

        }

        // 출력
        System.out.println(cnt);

    }
}