import java.util.Scanner;

public class Main {    
    
    public static int[] arr = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print(maxValue(n - 1));
    }

    public static int maxValue(int i) {
        if(i == 0)
            return arr[i];
    
        return Math.max(arr[i], maxValue(i - 1));
    }

}