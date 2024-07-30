import java.util.Scanner;
public class Main {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Math.max(n, m);
        int result = max;
        for (;;) {
            if (result % n == 0 && result % m == 0) {
                break;
            }
            result += max;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        solution();
    }
}