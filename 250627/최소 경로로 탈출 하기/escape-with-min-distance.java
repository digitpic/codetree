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
    private static int[][] grid = new int[MAX][MAX];
    private static int[][] visited = new int[MAX][MAX];
    private static int[][] steps = new int[MAX][MAX];
    private static Queue<Pair> queue = new LinkedList<>();
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        for (int row = 0; row < n; row++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int column = 0; column < m; column++) {
                grid[row][column] = Integer.parseInt(tokens.nextToken());
            }
        }

        push(0, 0, 0);
        find();

        if (answer == Integer.MAX_VALUE) {
            answer = -1;
        }

        System.out.println(answer);
    }

    private static void find() {
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int x = current.x;
            int y = current.y;

            int[] dx = new int[]{0, 1, 0, -1};
            int[] dy = new int[]{1, 0, -1,  0};
            
            for (int direction = 0; direction < 4; direction++) {
                int newX = x + dx[direction];
                int newY = y + dy[direction];

                if (isMovable(newX, newY)) {
                    push(newX, newY, steps[x][y] + 1);
                }
            }
        }

        if (visited[n - 1][m - 1] == 1) {
            answer = steps[n - 1][m - 1];
        }
    }

    private static void push(int x, int y, int step) {
        queue.add(new Pair(x, y));
        visited[x][y] = 1;
        steps[x][y] = step;
    }
 
    private static boolean isMovable(int x, int y) {
        return isInRange(x, y)
                && visited[x][y] == 0
                && grid[x][y] == 1;
    }

    private static boolean isInRange(int x, int y) {
        return 0 <= x && x < n
                && 0 <= y && y < m;
    }
}
