import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n번 반복
        for (int i = 0; i < n; i++) {

            // n-i
            for (int j = 0; j < n-i; j++ ) {
                System.out.print("*");
            }

            // 2*i
            for (int j = 0; j < 2*i; j++ ) {
                System.out.print(" ");
            }

            // n-i
            for (int j = 0; j < n-i; j++ ) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}