import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[MAX_N];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0, cnt = 0;
        for(int i = 0; i < n; i++) {

            if(i >= 1 && arr[i] == arr[i - 1])
                cnt++;

            else
                cnt = 1;
            
            ans = Math.max(ans, cnt);
        }
        
        System.out.print(ans);
    }
}