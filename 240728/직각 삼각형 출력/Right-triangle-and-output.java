import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // [1] n만큼 반복
        for (int i = 0, k = 0; i < n; i++, k += 2) {

            // [2] 1, 3, 5, ...만큼 반복
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
}