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

        sc.close();
        
        // 각 선분 제거
        for (int i = 0; i < n; i++) {

            int maxX1 = Integer.MIN_VALUE;
            int minX2 = Integer.MAX_VALUE;
            
            for (int j = 0; j < n; j++) {
                
                // i 번째 선분 제거
                if (i == j) 
                    continue;

                maxX1 = Math.max(maxX1, x1[j]);
                minX2 = Math.min(minX2, x2[j]);
            }
            
            if (maxX1 <= minX2) {
                System.out.println("Yes");
                return;
            }

        }
        
        System.out.println("No");
    }
}