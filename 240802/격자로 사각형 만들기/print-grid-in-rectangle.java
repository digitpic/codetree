import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // 첫번째 행과 첫번째 열에는 모두 1이 들어갑니다.
        for (int i=0; i<n; i++) {
            arr[i][0] = 1;
            arr[0][i] = 1;
        }

        // 나머지 칸들은 바로 위의 값과 바로 왼쪽 값, 그리고 왼쪽 위의 값의 합이 되어야 합니다.
        for (int row=1; row<n; row++) {
            for (int col=1; col<n; col++) {
                arr[row][col] = arr[row-1][col] + arr[row][col-1] + arr[row-1][col-1];
            }
        }

        // 배열을 출력합니다.
        for (int row=0; row<n; row++) {
            for (int col=0; col<n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}