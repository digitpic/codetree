import java.util.Scanner;
public class Main {
    public static int[] A = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] a = new int[m][2];

        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i=0; i<m; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        
        for (int i=0, sum=0; i<m; i++, sum=0) {
            int start = a[i][0] - 1;
            int end = a[i][1] - 1;

            for (int j=start; j<=end; j++) {
                sum += A[j];
            }

            System.out.println(sum);
        }

    }
}