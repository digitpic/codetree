import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n*2번 반복 
        for (int i = 0; i < n*2; i++) {

            // [1] 홀수
            // 1, 2, 3
            // n - (i - 1) / 2
            if (i % 2 == 1) {
                for (int j = 0; j < n - (i - 1) / 2; j++) {
                    System.out.print("* ");
                }
            }

            // [2] 짝수
            // 3, 2, 1
            // 1 + (i / 2)
            else {
                for (int j = 0; j < 1 + (i / 2); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }
}