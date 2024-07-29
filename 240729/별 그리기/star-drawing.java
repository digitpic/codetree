import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // [1] 위
        // n 번 반복
        for (int i = 0; i < n; i++) {
            
            // [1][1] 공백
            // n = 3: 2, 1, 0
            // n - 1 - i
            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" ");
            }

            // [1][2] 별
            // n = 3: 1, 3, 5
            // 2 * i + 1
            for (int j = 0; j < 2*i+1; j++ ) {
                System.out.print("*");
            }

            // [1][3] 줄내림
            System.out.println();

        } // end[1]

        // [2] 아래
        // n-1 번 반복
        for (int i = 0; i < n-1; i++) {

            // [2][1] 공백
            // n = 3: 1, 2
            // i+1
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }

            // [2][2] 별
            // n = 3: 3, 1
            // 2*n - 2*i - 3

            for (int j = 0; j < 2*n - 2*i - 3; j++) {
                System.out.print("*");
            }

            // [2][3] 줄내림
            System.out.println();
            
        } // end[2]

    } // endMain
}