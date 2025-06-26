import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX = 100;
    
    private static int n;
    private static int[][] grid;
    private static int[][] visited = new int[MAX][MAX];
    private static int count;
    private static int bombed;
    private static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        grid = new int[n][n];

        for (int row = 0; row < n; row++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int column = 0; column < n; column++) {
                grid[row][column] = Integer.parseInt(tokens.nextToken());
            }
        }

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (visited[row][column] == 0) {
                    visited[row][column] = 1;
                    count = 1;
                    find(row, column);
                    if (4 <= count) {
                        bombed++;
                    }
                }
            }
        }
        
        System.out.println(bombed + " " + max);
    }

    private static void find(int x, int y) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (isMovable(x, y, newX, newY)) {
                visited[newX][newY] = 1;
                count++;
                find(newX, newY);
            }
            
            max = Math.max(count, max);
        }
    }

    private static boolean isMovable(int x, int y, int newX, int newY) {
        if (!isInRange(newX, newY)) {
            return false;
        }

        if (visited[newX][newY] == 1) {
            return false;
        }

        if (grid[x][y] != grid[newX][newY]) {
            return false;
        }
    
        return true;
    }

    private static boolean isInRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}