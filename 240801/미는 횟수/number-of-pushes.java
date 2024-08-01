import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        
        int cnt = 0;

        int len = A.length();

        // 같지 않을 때 반복
        while (!A.equals(B)) {
            A = A.substring(1) + A.substring(0, 1);
            cnt++;
            if (cnt > len) {
                cnt = -1;
                break;
            }
        }

        System.out.println(cnt);

    }
}