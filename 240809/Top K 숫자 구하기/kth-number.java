import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] numList = new int[n];

        for (int i=0; i<n; i++)
            numList[i] = sc.nextInt();
        
        Arrays.sort(numList);
        
        System.out.println(numList[k-1]);

    }
}