import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;

        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        for (int i=0; i<n; i++) {
            char c = sc.next().charAt(0);
            int dist = sc.nextInt();
            int dir = -1;

            if (c == 'E') 
                dir = 0;
            
            else if (c == 'W')
                dir = 1;
            
            else if (c == 'S')
                dir = 2;
            
            else if (c == 'N')
                dir = 3;
            

            x += dx[dir] * dist;
            y += dy[dir] * dist;
        }

        System.out.println(x + " " + y);

    }
}