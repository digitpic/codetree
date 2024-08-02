import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int count = 1;

        int[][] arr = new int[n][m];

        for(int startCol = 0; startCol < m; startCol++) {
            int currCol = startCol;
            int currRow = 0;

            while(currCol >= 0 && currRow < n) {
                arr[currRow][currCol] = count;
                currRow++;
                currCol--;
                count++;
            }
        }

        for(int startRow = 1; startRow < n; startRow++) {
            int currRow = startRow;
            int currCol = m - 1;

            while(currCol >= 0 && currRow < n) {
                arr[currRow][currCol] = count;

                currRow++;
                currCol--;
                count++;
            }
        }
                
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}