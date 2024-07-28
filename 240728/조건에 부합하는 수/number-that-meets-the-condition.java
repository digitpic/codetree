import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // [1] 1부터 a까지 반복
        for (int i = 1; i <= a; i++) {

            // [2] 짝수이면서 4의 배수가 아닌 경우
            if ( i % 2 == 0 && i % 4 != 0 ) {
                continue;
            }

            // [3] 8로 나눈 몫이 짝수인 경우
            if ( (i / 8) % 2 == 0 ) {
                continue;
            }

            // [4] 7로 나눈 나머지가 4보다 작은 수
            if ( (i % 7) < 4 ) {
                continue;
            }

            System.out.print(i + " "); 
        }
        
    }
}