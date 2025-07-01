import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 4;
    
    private static int n;
    private static int[][] numbers = new int[MAX_N][MAX_N];
    private static int[][] moves = new int[MAX_N][MAX_N];
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        
        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                numbers[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }
        
        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                moves[i][j] = Integer.parseInt(tokens.nextToken());
            }       
        }
        
        tokens = new StringTokenizer(reader.readLine());
        int row = Integer.parseInt(tokens.nextToken()) - 1;
        int column = Integer.parseInt(tokens.nextToken()) - 1;
        
        find(row, column, 0);
        System.out.print(max);
    }

    private static void find(int x, int y, int count) {
        max = Math.max(max, count);
        
        int[] dx = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
        int move = moves[x][y] - 1;
        
        for (int i = 0; i < n; i++) {
            int nx = x + dx[move] * i;
            int ny = y + dy[move] * i;

            if (isMovable(nx, ny, numbers[x][y])) {
                find(nx, ny, count + 1);
            }
        }
    }

    private static boolean isMovable(int x, int y, int previous) {
        return isInRange(x, y) 
                && numbers[x][y] > previous;
    }

    private static boolean isInRange(int x, int y) {
        return 0 <= x && x < n
                && 0 <= y && y < n;
    }
}

