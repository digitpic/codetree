import java.util.Scanner;

public class Main {

    public static final int UNDEFINED = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] pos = new int[n];
        int[] pigeon = new int[n];
        int[] moveDir = new int[n];

        for (int i = 0; i < n; i++) {
            pigeon[i] = sc.nextInt() - 1;
            moveDir[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++)
            pos[i] = UNDEFINED;
        
        int moveCnt = 0;
        for (int i = 0; i < n; i++) {

            if( pos[pigeon[i]] == UNDEFINED) 
                pos[pigeon[i]] = moveDir[i];
            
            else if (pos[pigeon[i]] != moveDir[i]) {
                pos[pigeon[i]] = moveDir[i];
                moveCnt++;
            }

        }

        System.out.print(moveCnt);

    }
}