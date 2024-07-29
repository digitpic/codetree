import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 10;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] % 3 == 0) {
                System.out.print( arr[i-1] );
                break;
            }

        }

    }
}