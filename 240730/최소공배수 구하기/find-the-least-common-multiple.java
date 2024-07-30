import java.util.Scanner;
public class Main {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;
        for (int i = n; i < 100; i++) {
            if (i % n == 0 && i % m == 0) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        solution();
    }
}