import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a가 클 때
        if (a > b) {
            // c가 클 때
            if (c > a) {
                // 중앙값은 a
                System.out.println(a);
            }
            // a가 클 때
            else {
                // 중앙값은 c
                System.out.println(c);
            }
        }
        // b가 클 때
        else if (b > a) {
            // c가 클 때
            if (c > b) {
                // 중앙값은 b
                System.out.println(b);
            }
            // b가 클 때
            else {
                // 중앙값은 c
                System.out.println(c);
            }
        }
        else if (a > c) {
            if (b > a) {
                // 중앙값은 a
                System.out.println(a);
            }
            else {
                // 중앙값은 b
                System.out.println(b);
            }
        }

    }
}