import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        
        // 각 선분 제거
        for (int i = 0; i < n; i++) {

            int max_x1 = Integer.MIN_VALUE;
            int min_x2 = Integer.MAX_VALUE;
            
            for (int j = 0; j < n; j++) {
                
                if (i == j) 
                    continue;

                max_x1 = Math.max(max_x1, x1[j]);
                min_x2 = Math.min(min_x2, x2[j]);
            }
            
            if (max_x1 <= min_x2) {
                System.out.println("Yes");
                return;
            }

        }
        
        System.out.println("No");
    }
}