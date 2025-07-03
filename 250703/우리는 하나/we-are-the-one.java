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
    private static final int MAX = 8;
    private static final int DIRECTION_NUMBER = 4;

    private static int n;
    private static int k;
    private static int u;
    private static int d;
    private static int[][] grid;
    private static int[][] visited = new int[MAX][MAX];
    private static List<Pair> picked = new ArrayList<>();
    private static Queue<Pair> queue = new LinkedList<>();
    private static int range;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokens.nextToken());
        k = Integer.parseInt(tokens.nextToken());
        u = Integer.parseInt(tokens.nextToken());
        d = Integer.parseInt(tokens.nextToken());

        grid = new int[n][n];

        for (int row = 0; row < n; row++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int column = 0; column < n; column++) {
                grid[row][column] = Integer.parseInt(tokens.nextToken());
            }
        }

        findStartPoint(0);

        System.out.println(max);
    }

    private static void findStartPoint(int count) {
        if (count == k) {
            visited = new int[MAX][MAX];
            range = 0;
            
            for (int i = 0; i < k; i++) {
                push(picked.get(i).x, picked.get(i).y);
            }

            findRange();
            max = Math.max(max, range);    
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                picked.add(new Pair(i, j));
                findStartPoint(count + 1);
                picked.remove(picked.size() - 1);
            }
        }   
    }

    private static void push(int x, int y) {
        visited[x][y] = 1;
        queue.add(new Pair(x, y));
        range++;
    }

    private static void findRange() {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int x = current.x;
            int y = current.y;

            for (int direction = 0; direction < DIRECTION_NUMBER; direction++) {
                int nx = x + dx[direction];
                int ny = y + dy[direction];
                
                if (isInRange(nx, ny)) {
                    int difference = Math.abs(grid[x][y] - grid[nx][ny]);
                    if (isMovable(nx, ny, difference)) {
                        push(nx, ny);
                    }
                }
            }
        }            
    }

    private static boolean isMovable(int x, int y, int difference) {
        return isInRange(x, y)
                && visited[x][y] == 0
                && u <= difference && difference <= d;
    }

    private static boolean isInRange(int x, int y) {
        return 0 <= x && x < n
                && 0 <= y && y < n;
    }
}