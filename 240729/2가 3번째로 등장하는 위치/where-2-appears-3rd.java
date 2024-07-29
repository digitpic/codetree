import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 3) {
                break;
            }
            if (sc.nextInt() == 2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}