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
    private static Pair start;
    private static Pair end;

    private static int[][] visited = new int[MAX][MAX];
    private static int[][] steps = new int[MAX][MAX];
    private static Queue<Pair> queue = new LinkedList<>();

    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        start = new Pair(Integer.parseInt(tokens.nextToken()) - 1, Integer.parseInt(tokens.nextToken()) - 1);
        end = new Pair(Integer.parseInt(tokens.nextToken()) - 1, Integer.parseInt(tokens.nextToken()) - 1);

        push(start.x, start.y, 0);
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

            int[] dx = new int[]{-2, -2, -1, -1, 1, 1, 2, 2};
            int[] dy = new int[]{-1, 1, -2, 2, -2, 2, -1, 1};

            for (int direction = 0; direction < 8; direction++) {
                int newX = x + dx[direction];
                int newY = y + dy[direction];

                if (isMovable(newX, newY)) {
                    push(newX, newY, steps[x][y] + 1);
                }
            }
        }

        if (visited[end.x][end.y] == 1) {
            answer = steps[end.x][end.y];
        }
    }

    private static void push(int x, int y, int step) {
        queue.add(new Pair(x, y));
        visited[x][y] = 1;
        steps[x][y] = step;
    }

    private static boolean isMovable(int x, int y) {
        return isInRange(x, y)
                && visited[x][y] == 0;
    }

    private static boolean isInRange(int x, int y) {
        return 0 <= x && x < n
                && 0 <= y && y < n;
    }
}