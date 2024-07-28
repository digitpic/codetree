import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // [1] scanner
        Scanner sc = new Scanner(System.in);

        // [2] variable
        int a, b, sum = 0;

        // [3] input
        a = sc.nextInt();
        b = sc.nextInt();

        // [4] a부터 b까지 반복
        for (int i = a; i < b+1; i++) {
            // [5] 그중 6의 배수, 8의 배수가 아닌 수
            if (i % 6 == 0 && i % 8 != 0) {
                // [6] sum
                sum += i;
            }
        }
        
        // [7] print
        System.out.println(sum);
    }
}