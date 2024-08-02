import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n을 입력받습니다.
        int n = sc.nextInt();

        // 2차원 배열을 구현합니다.
        int[][] arr = new int[n][n];

        // 배열의 각 행의 첫 열과 마지막 열을 1로 초기화합니다.
        for(int i = 0; i < n; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        
        // 배열의 숫자를 채웁니다.
        for(int i = 0; i < n; i++)
            for(int j = 1; j < i; j++)
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                
        // 배열을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}