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
    private static int k;
    private static int[][] grid;
    private static int[][] starts;
    private static int[][] visited = new int[MAX][MAX];
    private static Queue<Pair> queue = new LinkedList<>();
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        k = Integer.parseInt(tokens.nextToken());

        grid = new int[n][n];

        for (int row = 0; row < n; row++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int column = 0; column < n; column++) {
                grid[row][column] = Integer.parseInt(tokens.nextToken());
            }
        }

        starts = new int[k][2];
        for (int row = 0; row < k; row++) {
            tokens = new StringTokenizer(reader.readLine());
            starts[row][0] = Integer.parseInt(tokens.nextToken()) - 1;
            starts[row][1] = Integer.parseInt(tokens.nextToken()) - 1;
        }

        for (int row = 0; row < k; row++) {
            push(starts[row][0], starts[row][1]);
            count++;
        }

        bfs();

        System.out.println(count);
    }

    private static void push(int x, int y) {
        visited[x][y] = 1;
        queue.add(new Pair(x, y));
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int x = current.x;
            int y = current.y;

            int[] dx = new int[]{0, 1, 0, -1};
            int[] dy = new int[]{1, 0, -1, 0};

            for (int direction = 0; direction < 4; direction++) {
                int newX = x + dx[direction];
                int newY = y + dy[direction];

                if (isMovable(newX, newY)) {
                    push(newX, newY);
                    count++;
                }
            }
        }
    }

    private static boolean isMovable(int x, int y) {
        return isInRange(x, y)
                && visited[x][y] == 0
                && grid[x][y] == 0;
    }

    private static boolean isInRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}