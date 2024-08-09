import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numList1 = new int[n];
        int[] numList2 = new int[n];

        for (int i=0; i<n; i++)
            numList1[i] = sc.nextInt();

        for (int i=0; i<n; i++)
            numList2[i] = sc.nextInt();
        
        Arrays.sort(numList1);
        Arrays.sort(numList2);

        for (int i=0; i<n; i++) {
            if (numList1[i] != numList2[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}