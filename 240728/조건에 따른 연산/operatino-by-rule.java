import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        // [1] n 입력
        int n = sc.nextInt();
        
        // [2] 조건 적용
        while (true) {
            if (n >= 1000)
                break;

            if (n % 2 == 0) {
                n *= 3;
                n += 1;
            }
            else {
                n *= 2;
                n += 2;
            }
            cnt++;
        }

        // [3] cnt 출력   
        System.out.println(cnt);
    }
}