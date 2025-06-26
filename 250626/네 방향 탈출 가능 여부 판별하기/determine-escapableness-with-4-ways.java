import java.util.*;
import java.io.*;

class Pair {
    public int x;
    public int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static final int MAX = 100;

    private static int n;
    private static int m;
    private static int[][] grid;
    private static int[][] visited = new int[MAX][MAX];
    private static Queue<Pair> queue = new LinkedList<>();

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

        push(0, 0);
        bfs();

        System.out.println(visited[n - 1][m - 1]);
    }

    private static void push(int x, int y) {
        visited[x][y] = 1;
        queue.add(new Pair(x, y));
    }

    private static void bfs() {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int x = current.x;
            int y = current.y;

            for (int direction = 0; direction < 4; direction++) {
                int newX = x + dx[direction];
                int newY = y + dy[direction];

                if (isMovable(newX, newY)) {
                    push(newX, newY);
                }
            }
        }
    }

    private static boolean isMovable(int x, int y) {
        return isInRange(x, y) && visited[x][y] == 0 && grid[x][y] == 1;
    }

    private static boolean isInRange(int x, int y) {
        return (0 <= x && x < n) && (0 <= y && y < m);
    }
}