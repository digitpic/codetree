import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        // 처리
        int ans = 0, cnt = 0;
        for (int i=0; i<n; i++) {

            // t보다 큰 경우
            if (t < arr[i]) {
                cnt++;
                ans = Math.max(ans, cnt);
            } 

            else {
                // t보다 작거나 같은 경우 연속 부분 수열 종료
                cnt = 0;
            }

        }

        // 출력
        System.out.println(ans == 0 ? 0 : ans);
        
    }
}