import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a가 클 때
        if (a > b) {
            if (c > a) {
                System.out.println(a);
            }
            else if (b > c) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if (c > a) {
                System.out.println(a);
            }
            else if (b < a) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }

    }
}