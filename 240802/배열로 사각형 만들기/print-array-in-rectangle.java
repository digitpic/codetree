import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[][] arr = new int[n][n];

        // [1] 첫번째 행과 첫번째 열은 모두 1로 초기화 합니다.
        for (int row=1; row<n; row++) {
            arr[row][0] = 1;
        }

        for (int col=0; col<n; col++) {
            arr[0][col] = 1;
        }

        // [2] 나머지 칸들은 바로 위의 값과 바로 왼쪽의 값을 더합니다.
        for (int row=1; row<n; row++) {
            for (int col=1; col<n; col++) {
                arr[row][col] = arr[row-1][col] + arr[row][col-1];
            }
        }

        // [3] 배열의 값들을 출력합니다.   
        for (int row=0; row<n; row++) {
            for (int col=0; col<n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}