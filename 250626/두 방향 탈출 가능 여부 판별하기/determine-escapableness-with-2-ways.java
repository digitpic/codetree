import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX = 100;

    private static int n;
    private static int m;
    private static int[][] grid;
    private static int[][] visited = new int[MAX][MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }

        visited[0][0] = 1;
        dfs(0, 0);

        System.out.println(visited[n - 1][m - 1]);
    }

    private static void dfs(int x, int y) {
        int[] dx = new int[]{1, 0};
        int[] dy = new int[]{0, 1};

        for (int i = 0; i < 2; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (isCanMove(newX, newY)) {
                visited[newX][newY] = 1;
                dfs(newX, newY);
            }
        }
    }

    private static boolean isCanMove(int x, int y) {
        if (!isInRange(x, y)) {
            return false;
        }

        if (visited[x][y] == 1) {
            return false;
        }

        if (grid[x][y] == 0) {
            return false;
        }

        return true;
    }

    private static boolean isInRange(int x, int y) {
        return (0 <= x && x < n) && (0 <= y && y < m);
    }
}
