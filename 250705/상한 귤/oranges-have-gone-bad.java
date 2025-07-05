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
    private static final int MAX_N = 100;
    private static final int DIRECTION_NUMBER = 4;

    private static int n;
    private static int k;
    private static int[][] grid = new int[MAX_N][MAX_N];
    private static int[][] visited = new int[MAX_N][MAX_N];
    private static Queue<Pair> queue = new LinkedList<>();
    private static int time = 0;

    private static int[][] answer = new int[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        k = Integer.parseInt(tokens.nextToken());
        
        for (int r = 0; r < n; r++) {
            tokens = new StringTokenizer(reader.readLine());
            for (int c = 0; c < n; c++) {
                int status = Integer.parseInt(tokens.nextToken());
                grid[r][c] = status;
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                answer[r][c] = -2;
            }
        }
        
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 0) {
                    answer[r][c] = -1;
                }

                if (grid[r][c] == 2) {
                    push(r, c);
                    answer[r][c] = time;
                }
            }
        }

        find();

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(answer[r][c] + " ");
            }
            System.out.println(); 
        }
    }

    private static void push(int x, int y) {
        visited[x][y] = 1;
        queue.add(new Pair(x, y));
    }

    private static void find() {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        
        while (!queue.isEmpty()) {
            time++;

            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                Pair current = queue.poll();

                for (int dir = 0; dir < DIRECTION_NUMBER; dir++) {
                    int nx = current.x + dx[dir];
                    int ny = current.y + dy[dir];

                    if (isMovable(nx, ny)) {
                        push(nx, ny);
                        answer[nx][ny] = time;
                    }
                }
            }
        }
    }

    private static boolean isMovable(int x, int y) {
        return isInRange(x, y)
                && visited[x][y] == 0
                && grid[x][y] == 1;
    }

    private static boolean isInRange(int x, int y) {
        return  0 <= x && x < n
                && 0 <= y && y < n;
    }
}