import java.util.Scanner;

public class Main {
    // MAX_N = 1000;
    // MAX_M = 1000;
    // MAX_T = MAX_N*MAX_M;
    public static final int MAX_T = 1000000;

    public static int[] posA = new int[MAX_T + 1];
    public static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int indexA = 1;
        // n 번 반복
        for(int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int time = sc.nextInt();
            
            // time 번 반복
            while(time-- > 0) {
                if(dir == 'R')
                    posA[indexA] = posA[indexA - 1] + 1;
                else
                    posA[indexA] = posA[indexA - 1] - 1;
                indexA++;
            }

        }
        
        int indexB = 1;
        // n 번 반복
        for(int i = 0; i < m; i++) {
            char dir = sc.next().charAt(0); 
            int time = sc.nextInt();
            
            // time 번 반복
            while(time-- > 0) {
                if(dir == 'R')
                    posB[indexB] = posB[indexB - 1] + 1;
                else
                    posB[indexB] = posB[indexB - 1] - 1;
                
                indexB++;
            }
        }
        
        int ans = -1;
        for(int i = 1; i < indexA; i++) {
            if(posA[i] == posB[i]) {
                ans = i;
                break;
            }
        }
        
        System.out.print(ans);
    }
}