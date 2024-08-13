import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX=100;
        // 0~100
        // 0~100
        int[] board = new int[MAX+1];

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        for (int i=a; i<b; i++)
            board[i+1] = 1;

        for (int i=c; i<d; i++)
            board[i+1] = 1;

        int cnt = 0;
        for (int i=0; i<=MAX; i++)
            if (board[i] == 1)
                cnt++;

        System.out.println(cnt);

    }
}