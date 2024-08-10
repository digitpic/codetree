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
        int cnt = 0, leader = 0;
        for (int i=1; i<indexA; i++) {
            
            if(posA[i] > posB[i]) {
                // 조합이 바뀐 경우
                if(leader != 1)
                    cnt++;
                
                // 리더를 A로 변경
                leader = 1; 
            }
            else if(posA[i] < posB[i]) {
                // 조합이 바뀐 경우
                if(leader != 2)
                    cnt++;
                
                // 리더를 B로 변경
                leader = 2; 
            }
            else {
                // 조합이 바뀐 경우
                if(leader != 3)
                    cnt++;
                
                // 리더를 둘 다로 변경
                leader = 3;
            }

        }

        // 출력
        System.out.println(cnt);

    }
}