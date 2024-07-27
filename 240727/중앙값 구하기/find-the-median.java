import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a가 클 때
        if (a > b) {
            // c > a > b
            if (c > a) {
                System.out.println(a);
            }
            // a > b > c
            else if (b > c) {
                System.out.println(b);
            }
            // a > c > b
            else {
                System.out.println(c);
            }
        }
        // b가 클 때
        else {
            // b > a > c
            if (a > c) {
                System.out.println(a);
            }
            // c > b > a
            else if (c > b) {
                System.out.println(b);
            }
            // b > c > a
            else {
                System.out.println(c);
            }
            
        }

    }
}