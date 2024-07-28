import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        // [1] 5번 반복
        for (int i = 0; i < 5; i++) {

            // [2] 짝수라면
            if (sc.nextInt() % 2 == 0) {

                // [3] 카운트
                cnt++;
            }
        }
        // [4] 카운트 변수 출력
        System.out.println(cnt);
    }
}